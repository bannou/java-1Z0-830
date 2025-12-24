# Java Data Types

Java is statically typed with 2 main data types: Primitive & Reference

## Primitives

| Type    | Size in bits                 | default value | With no suffix, X is default |
|---------|------------------------------|---------------|------------------------------|
| byte    | 8                            | O             |                              |
| short   | 16                           | O             |                              |
| int     | 32                           | 0             | X                            |
| long    | 64                           | 0L            |                              |
| float   | 32                           | 0.0F          |                              |
| double  | 64                           | 0.0D          | X                            |
| char    | 16                           | null          |                              |
| boolean | JVM implementation dependent | false         |                              |

> Efficiency and memory usage

### Suffixes

By default:

- a decimal non fractionated number is treated as an integer.
- a decimal fractionated number is treated as a double.

  int intNum = 123;
  double doubleNum = 3.14;

- long literals -> L
- float literals -> D

  // Compilation Error: incompatible types
  float floatNum = 3.14;

### Underscores

Underscores can be used for clarity.

    int million = 1_000_000; 
    long creditCardNumber = 1234_5678_9012_3456L; 
    float pi = 3.14_15F;
    double avogadro = 6.022_140_857e23;

No underscores at the start or the end

    // Compilation Error: underscore at the start or the end
    int x1= _1000; 
    int x2 = 1000_;

No underscores next to decimal points

     // Compilation Error: underscore next to a decimal point
    int y1 = 3_.14;
    int y2 = 3._14;

No underscores before a suffix

     // Compilation Error: underscore before a suffix
    long z1 = 1000_L;

### Notations for Integer Literals

Many possible for integer

    // Decimal notation (10)
    int decimalNum = 32;

    // Hexadecimal notation (16)
    int hexNum = 0x20;
    int hexNum = 0X20;

    // Octal notation (8)
    int octalNum = 040;

    // Binary notation (2)
    int binaryNum = 0b100000;
    int binaryNum = 0B100000;

## Type conversion and Casting

Type conversion comes in 2 ways:

### Implicit conversion or Up Casting

Automatically Java converts to a larger type.

    byte b = 10;
    int i = b;      // bit to int
    long l = i;     // int to long
    float f = l;    // long to float
    double b = f;   // float to double

### Explicit conversion or Down Casting

Converting from large to smaller types is not straightforward

    // Does not compile - no implicit conversion int to byte
    byte b = 128;

    // Does not compile - no implicit double int to float
    float pi = 3.14;

Explicit casting needs to be used for this type of conversions

    byte b = (byte) 127;
    float pi = (float) 3.14;

Overflow happens when trying to fit a larger value to a type

    // Overflow - the value is -128 (the lower range)
    byte b = (byte) 128; 
    float pi = (float) 3.14;

## Wrapper classes

Primitive servers as basing building blocks. Wrappers classes allows us to treat primitives as objects.

| Primitive type | Wrapper class | Inherit from Number |
|----------------|---------------|---------------------|
| byte           | Byte          | x                   |
| short          | Short         | x                   |
| int            | Integer       | x                   |
| long           | Long          | x                   |
| float          | Float         | x                   |
| double         | Double        | x                   |
| char           | Char          |                     |
| boolean        | Boolean       |                     |

> Wrapper Classes are Immutable !

### parseXxx()

All wrapper classes (except Char) offers parseXxx() static methods taking in param a String and return the primitive
type.

> public static WrapperType.parsePrimitiveType(String s) throws NumberFormatException

> public static WrapperType.parsePrimitiveType(String s, int radix) throws NumberFormatException

### valueOf()

Allow to box primitive types to their corresponding Wrapper classes

>public static WrapperType valueOf(primitiveType)

>public static WrapperType valueOf(String s) throws NumberFormatException

>public static WrapperType valueOf(String s, int radix) throws NumberFormatException

### xxxValue()

Allows to return the value of the wrapper as a primitive type

> public byte Byte.byteValue()


### Character wrapper methods
    
Some methods are specific to Char wrapper class, useful for text processing and validation:
 
- static boolean isDigit(char ch);
- static boolean isLetter(char ch);
- static boolean isLetterOrDigit(char ch);
- static boolean isLowerCase(char ch);
- static boolean isUpperCase(char ch);
- static boolean isWhitespace(char ch);
- static char toLowerCase(char ch);
- static char toUpperCase(char ch);
- static char toTitleCase(char ch);


> Wrapper classes DO NOT TURN primitives into objects.
> 
> They allow primitives to be used in object-based contexts.

## Autoboxing and Unboxing

Autoboxing is an automatic conversion of a primitive type to its corresponding wrapper class

Unboxing is the reverse process.

