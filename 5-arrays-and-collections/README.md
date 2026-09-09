# Arrays vs Collections

- arrays are static and used whenever the size is known in advance
- collections are dynamic and used whenever the size is not known from the beginning.

# Arrays

 All the following are valid declarations:
 - int[] numbers = { 15, 99 } 
 - int[] ids = new int[] { 10, 20 } 
 - var scores = new int[] { 85, 90 }

# Collections

## List

- maintain insertion order
- allow duplicates
- ArrayList, LinkedList

## Set

- insertion order not maintained
- uniqueness is guaranteed
- HashSet, TreeSet

## Queue collection

- insertion order not maintained
- Queue, PriorityQueue

## Map

- k/v pair
- unique keys
- HashMap, TreeMap