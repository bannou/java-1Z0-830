# Introducing exception handling

Exception in general means I can not handle the situation anymore.

It was before expressed with a returned value (less than 0) -1 , -4  

## Basic syntax

The minimum syntax for exception handling is:

### try / catch

```java
try {
    // risky code
} catch (ExceptionType e) {
    // code to handle ExceptionType
} 
```

### try / finally

```java
try {
    // risky code
} finally {
    // code that will always be executed, regardless of whether an exception was thrown or not
}
```

### try / chaining catch blocks

As long as the hierarchy of exception types allows, we can chain catch blocks to handle different types of exceptions

The exception types should be from more specific to more general, otherwise an unreachable code compilation error will be raised.

```java
try {
    // risky code
} catch (ExceptionType1 e) {
    // code to handle ExceptionType1
} catch (ExceptionType2 e) {
    // code to handle ExceptionType2
} catch (Exception e) {
    // code to handle any other exception
}
```

### try / multi-catch block

```java
try {
    // risky code
} catch (ExceptionType1 | ExceptionType2 e) {
    // code to handle either ExceptionType1 or ExceptionType2
}
```

### finally block

The finally block is always executed, regardless of whether an exception was thrown or not. 

It is typically used for cleanup code, such as closing resources.

Catch block become optional in presence of finally block.

```java
try {
    // risky code
} catch (Exception e) {
    // code to handle exception
} finally {
    // cleanup code
}
```