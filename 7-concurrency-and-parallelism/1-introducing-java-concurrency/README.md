# Concurrency problem

The entry point of a program is the main thread, which is the first thread to be executed. 
The JVM will choose when to execute the main thread and when to execute the other threads. 
The JVM will also choose how many threads to run at the same time, which is called parallelism.


# Task: Runnable and Callable

 Via the creation of a Runnable object, then creating a Thread object (the worker) and pass it the runnable and calling thread.run().

- The Runnable interface has a single method, run(), which is called when the thread is started. (java SE 1.0)
- The Callable interface is similar to Runnable, but it can return a value and throw a checked exception. (java SE 5)

# Thread 

Thread represents a platform thread. From Java SE 19, virtual threads are also available.

new Thread() / new Thread(String) / new Thread(Runnable) / new Thread(Runnable, String)

## Lifecycle

- created on NEW state
- once start(), it passes to the active RUNNABLE state
- on picked by the JVM, RUNNING state
- when a Thread is waiting for notification from other threads, it is in the WAITING state
- when a Thread is waiting for a specified amount of time, it is in the TIMED_WAITING state
- when a Thread is acquiring a lock, it is in the BLOCKED state.
- when a Thread is finished, it is in the TERMINATED state.


Thread implements Runnable, so it can be passed to another Thread object.

Thread.sleep() puts the current thread to sleep for a specified amount of time, allowing other threads to execute. It can throw InterruptedException if another thread interrupts the sleeping thread.

Once timeout is finished, it's on Ready state again.

## Volatile

For optimization, the JVM may cache the value of a variable in a thread's local memory.

    To be able to see the latest value of a variable, it should be declared as volatile. This ensures that the value is always read from main memory, rather than from a thread's local cache.

## Virtual Threads

Platform threads are mapped one-to-one to the operating system threads 
    
    when the thread is blocked, the OS thread is blocked too. This can lead to performance issues when there are many threads.

Virtual threads are lightweight threads that are managed by the Java Virtual Machine (JVM) rather than the operating system. 
They allow for a large number of concurrent threads without the overhead of OS-level threads.

When a virtual thread is blocked, the JVM can suspend it and allow other virtual threads to run, improving performance and scalability.

    A virtual thread is a deamon thread, which means that it does not prevent the JVM from exiting when the main thread finishes execution.
    
    The JVM will will stop when either it contains only deamon threads or when the main thread finishes execution.

    Calling join() on a virtual thread will block the calling thread until the virtual thread has completed its execution. This allows for synchronization between threads and ensures that the calling thread waits for the virtual thread to finish before proceeding.