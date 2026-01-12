# The if-else statement

    if (condition) {
        statement;   
    } else if (condition) {
        statement;   
    } else {
        statement;   
    } 

- condition must be a boolean.
- parenthesis are mandatory too.
- the braces are not mandatory as long as only one statement is in the block

# Ternary expression

    var x = booleanExpression ? statement1 : statement2;

- always returns a value.
- both values returned on the two branches must be of the same type.

# Switch

    switch (variable) {
        case option1:
                statement;
                break;
        case option2:
                statement;
                break;
        default:
                statement;
                break;
    }

- var should be of type scalar enumerated (byte, short, int, char) and their eq Wrappers + String + enum (+ all custom objects starting from java 21)
- order of the case statement does not matter IN CASE OF MATCH
- if any match happens and no break are there, all the code inside the other cases will be executed.
- duplicating case conditions does not compile
- 