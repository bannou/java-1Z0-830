# Manipulating

String is a reference type.

- String is immutable.
- JVM reuse an existing literal
- when creating a String literal, JVM checks the existence of this literal in the String Constant Pool to avoid
  recreating in case it exists already.
- can use string.intern() to force reusing the String constant pool (do not use in real world).
- new String("") forces the creation of a new reference in the heap.

## Common String methods

### Concatenating Strings

Two or more Strings can be concatenated using with + or .concat().

- using + operator => The compiler improves the concatenation with + by using StringBuilder() behind the scenes,
  avoiding creating a string on each '+'.
- using .concat() => A new String is created on each .concat()

### subString()

Returns a portion of a string.

### chatAt()

Returns a character in a given position.

### startWith()

Checks if a String begins with a given prefix.

## Text blocks

Text blocks allows to present a block of text without having to represent the "new line" character and the escape
etc ...

- preserve indentation
- preserve new lines

> Escaping
>
> - only """ needs to be escaped inside the text block
> - to include a \, use \\.


    \ at the end of the line cancels the new line character

    """Java \ 
    Rocks !""".equals("Java Rocks !") => true


## The String Builder class

String Builder offers the possibility to change the content of String without having to recreate a new one.

Multiple ways to instantiate a StringBuilder:

| Constructor                         | Behavior                                                                                               |
|-------------------------------------|--------------------------------------------------------------------------------------------------------|
| new StringBuilder()                 | allocate by default a length of 16 / needs to reallocate if gone further (may cause performance issue) |
| new StringBuilder(n)                | give as parameter the length to allocate                                                               |
| new StringBuilder("string example") | initialize with a string.                                                                              |


> String and StringBuilder both implement CharSequence

> StringBuilder is mutable but not synchronized / thread-safe 
> 
> StringBuffer is thread-safe


### append()

### insert()

### delete()

### deleteAt()

### replace()

### setCharAt()

### reverse()