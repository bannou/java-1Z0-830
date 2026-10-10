# Concurrent collections and parallel streams

## Synchronized collections

Synchronized collections implement the same interfaces as the non-synchronized collections with the same methods, but they are synchronized to ensure that only one thread can access the collection at a time.

It's a proxy for the original collection, so it can be used in the same way as the original collection.

```java
List<String> list = Collections.synchronizedList(new ArrayList<>());    
```

### CopyOnWriteArrayList

It is a thread-safe variant of ArrayList in which all mutative operations (add, set, and so on) are implemented by making a fresh copy of the underlying array.

It's useful when you have a list that is frequently read but infrequently modified, as it allows for safe iteration without the need for external synchronization.

```java
CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
```

## Parallel streams

are based on ForkJoin framework, which allows for parallel processing of data in a stream. It can be used to process large collections of data in parallel, taking advantage of multiple CPU cores.