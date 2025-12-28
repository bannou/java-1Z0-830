# Operators

Symbol that tells the compiler to perform a specific mathematical or logical operation.

Operator precedence dictates which operates is evaluated first.

Most operators evaluates from left-to-right, expect for unary operations and assignments which evaluates right-to-left.

Postfix operation happens before prefix ones

## Unary operators

### Negation Operator

Used to negate a numeric value, changing its sign.

### Unary Complement Operator (Bitwise complement)

Inverts all bits in a number, changing the 0 -> 1 and vice versa

- the first bit is dedicated for sign

> For positive numbers, ~N = -(N+1)                 ~5 = -6
>
> For negative numbers, ~(-N) = |N| -1              ~-5 = 4

### Increment and Decrement operators

++ and -- changes the variables values in prefix (inc/dec first) or postfix form (inc/dec last).

### Using Binary (arithmetic) operators

Using float and double can create precision issues. To avoid those, BigDecimal class can be used.

### Bitwise AND operator

### Bitwise OR operator

### Bitwise XOR operator

a ^ b

## Shift operator

### Left Shift operator

It moves the bits of the number left to the specified position, filling the empty with 0.

> Equivalent to multiplying the number by 2 ^ x.
>
> a << x => a * 2 ^ x

### Signed Right Shift operator

It moves the bits of the number right to the specified position, filling the empty with the sign number.

> Equivalent to dividing the number by 2 ^ x.
>
> a >> x => a / 2 ^ x

### Unsigned Right Shift operator

It moves the bits of the number right to the specified position, filling the empty with 0 regardless of the sign.

> a >>> x

## Compound Assignment operators

Changes the current variable based on its current values.

- variable op= expression EQ variable = variable op expression

> Compound operations can be more performant since the variable is evaluated only once comparing to the classic
> assignment where it's evaluated twice.

## Relational operators

(object instanceof Type variable) do both:

- check instanceof test
- if yes, do the assignment to a variable

## Equality operators

== and != are used with:

- primitives to compare values
- references to compare references

In order to compare the content of 2 references, equals() needs to be overriding respecting the following:

- symmetry: a.equals(b) => b.equals(a) must be true
- reflexivity: a.equals(a) must be true
- transitivity: a.equals(b) && b.equals(c) => a.equals(c) must be true
- consistency: the result should remains the same if the objects didn't change
- non-nullity: a.equals(null) returns false

> Records automatically implements equals and hashCode, but still can be overridden

## Logical operators

Logical operators are used for boolean expressions:

| operator                  | sign | priority |
|---------------------------|------|----------|
| logical NOT               | !    | +++      |
| logical AND               | &    | ++       | 
| logical OR                | \|   | ++       |           
| logical XOR               | ^    | ++       | 
| court-circuit logical AND | &&   | +        | 
| court-circuit logical OR  | \|\| | +        | 

Some of them (logical AND, logical OR and logical XOR) can be used as bitwise operators when applied to integers.

> Court-circuit operators does not require to evaluate the entier expression. It helps to avoid NPE
>
> For example: (false && XXX), the XXX is not evaluate since the result is false regardless.
>
> Court-circuit have greater priority than logical ones.

## Promotion rules

Java automatically converts small types to larger types to avoid precision loss:

- if one operant is double, the other becomes a double.
- if one operant is float, the other becomes a float.
- if one operant is long, the other becomes a long.
- otherwise they become int.

> Compound assignment operators assign the result the left operand type => CAN PROVOKE DATA LOSS
>
> int i = 10; long l = 5L; i += l; // Equivalent to i = (int)(i+l);

# Math API

## MAX and MIN

## POW

For Power operation, both operands are double.

- any number raised to 0, returns 1.0.
- any number raised to 1, returns itself.
- if any of the operands is NAN, the result is NAN (expect of the base is 1, it returns 1.0)

## ROUNDING

- round() round values. 0.5 is roundedUp.
- rint() returns the closest int to the double in param. If both are equally close, the even one is returned.
- floor()
- ceil()

## Random

Returns a random double between 0.0 and 1.0.