# Thread Safety

## Concurrency problems

A method is thread-safe if it can be safely invoked by multiple threads at the same time without causing any problems, such as data corruption or unexpected behavior.

Race conditions occur when multiple threads access shared data and try to change it at the same time. If the sequence of execution is not controlled, it can lead to inconsistent or incorrect results.

Data corruption can occur when multiple threads modify shared data without proper synchronization, leading to unexpected behavior or crashes.

## Synchronization mechanisms

### Synchronized blocks

synchronize(Object lock)

### Volatile

can be efficient for simple cases for get() and set(), but it does not provide atomicity for compound actions (like incrementing a counter).

### Atomic classes

They are part of the java.util.concurrent.atomic package and include classes like AtomicInteger, AtomicLong, and AtomicReference, which are wrappers around a single value.

Java uses compare-and-swap (CAS) operations to provide atomicity for compound actions. 

 
### Locks

Provides more flexible ways to control locks, allowing for more fine-grained control over thread access to shared resources.

Lock instance can be sent to another thread to be used for synchronization, allowing for more complex synchronization patterns.

#### ReentrantLock

is owned by the thread that acquired it, and can be released only by that thread. 

It allows a thread to acquire the lock multiple times without causing a deadlock.

#### ReentrantReadWriteLock

contains two locks: a read lock and a write lock. The read lock can be held by multiple threads simultaneously, while the write lock is exclusive and can only be held by one thread at a time.