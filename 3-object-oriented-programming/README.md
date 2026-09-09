## Destroying objects

The process of finding and deleting unused objects from the memory heap.

A part of multiple implementations, a GC process is composoed of 

### Mark

identify which objects are eligible for deletion.

### Delete

removes unreferenced objects to free memory.

### Compact

optional step, during optimization of the free memory takes place.

GC Roots
- local variables 
- active threads
- static variables

