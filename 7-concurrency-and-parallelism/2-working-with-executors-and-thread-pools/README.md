# Working with Executors and Thread Pools

java.util.concurrent, introduced in java SE 5, provides a high-level API for managing threads and concurrency.
  
It includes classes for:

- concurrent collections
- queues
- synchronizers
- executors
- locks
- atomics

## Executors and Thread Pools

### Executor interface
Executor is a simple interface that provides a way to execute tasks asynchronously. 
It has a single method: void execute(Runnable command)

### ExecutorService interface
ExecutorService extends Executor with 
- shutdown: blocks new tasks submission and initiates an orderly shutdown of the executor service.
- awaitTermination methods: block until all tasks have completed execution after a shutdown request, or the timeout occurs, or the current thread is interrupted, whichever happens first.

### AbstractExecutorService class
AbstractExecutorService is an abstract class that implements the ExecutorService interface and provides a base implementation for creating custom executor services.
provides methods for submitting tasks:
- submit(Callable<T> task): submits a Callable task for execution and returns a Future representing the pending result of the task.
- submit(Runnable task, T result): submits a Runnable task for execution and returns a Future

 
Executors.newSingleThreadExecutor();        -> create a single-threaded executor that uses a single worker thread to execute tasks.
Executors.newFixedThreadPool(int nThreads); -> create a fixed-size thread pool with the specified number of threads.

## Callable

The Callable interface is similar to Runnable, but it can return a value and throw a checked exception.

Submit(Callable<T> task) method submits a Callable task for execution and returns a Future representing the pending result of the task. 

### Future interface
The Future interface represents the result of an asynchronous computation. It provides methods to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation.

- .get() method blocks until the computation is complete and returns the result. If the computation was cancelled, it throws a CancellationException. If the computation threw an exception, it throws an ExecutionException.
- .isDone() method returns true if the computation is complete, whether it completed normally or was cancelled.
- .cancel(boolean mayInterruptIfRunning) method can be used to cancel a task that has not yet started or is currently running. If the task has already completed, calling cancel() will have no effect.
