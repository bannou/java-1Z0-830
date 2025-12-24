void main() {

    // parseXxx()
    // from String
    int intValue = Integer.parseInt("42");
    double doubleValue = Double.parseDouble("3.14");
    boolean booleanValue = Boolean.parseBoolean("true");

    System.out.println(intValue);       // 42
    System.out.println(doubleValue);    // 3.14
    System.out.println(booleanValue);   // true

    // parseXxx()
    // from String and radix
    int binaryValue = Integer.parseInt("1010", 2);
    int hexValue = Integer.parseInt("FF", 16);
    int octalValue = Integer.parseInt("77", 8);

    System.out.println("Binary 1010 = " + binaryValue);         // 10
    System.out.println("Hex FF = " + hexValue);                 // 255
    System.out.println("Octal 77 = " + octalValue);             // 63

    // valueOf()
    // from primitive
    Integer intObj1 = Integer.valueOf(42);
    System.out.println("From primitive: " + intObj1);           // 42

    // valueOf()
    // from String
    try {
        Integer intObj2 = Integer.valueOf("123");
        System.out.println("From String: " + intObj2);          // 123
    } catch (NumberFormatException e) {
        System.out.println("Invalid number format");
    }

    // valueOf()
    // from String and radix
    Integer fromBinary = Integer.valueOf("1010", 2);
    Integer fromHex = Integer.valueOf("1A", 16);

    System.out.println("Binary 1010 = " + fromBinary);          // 10
    System.out.println("Hexa 1A = " + fromHex);                 // 26

    // xxxValue()
    Byte byteObj = Byte.valueOf((byte) 42);
    Short shortObj = Short.valueOf((short) 42);
    Integer intObj = Integer.valueOf(45);
    Long longObj = Long.valueOf(1234);
    Float floatObj = Float.valueOf(123.4f);
    Double doubleObj = Double.valueOf(1234.56d);

    // get primitive type from corresponding Wrapper class
    byte byteValue = byteObj.byteValue();
    short shortValue = shortObj.shortValue();
    int intValuee = intObj.intValue();
    long longValue = longObj.longValue();
    float floatValue = floatObj.floatValue();
    double doubleValuee = doubleObj.doubleValue();

    // get different primitive type from a Wrapper class
    byte intObjAsByteValue = intObj.byteValue();
    short intObjAsShortValue = intObj.shortValue();
    int intObjAsIntValue = intObj.intValue();
    long intObjAsLongValue = intObj.longValue();
    float intObjAsFloatValue = intObj.floatValue();
    double intObjAsDoubleValue = intObj.doubleValue();

    System.out.println("Original Integer = " + intObj);             // 45
    System.out.println("As byte = " + intObjAsByteValue);           // 45
    System.out.println("As short = " + intObjAsShortValue);         // 45
    System.out.println("As int = " + intObjAsIntValue);             // 45
    System.out.println("As long = " + intObjAsLongValue);           // 45
    System.out.println("As float = " + intObjAsFloatValue);         // 45.0
    System.out.println("As double = " + intObjAsDoubleValue);       // 45.0


    // Char methods
    char digit = '7';
    char letter = 'A';
    char lowercase = 'a';
    char whitespace = ' ';

    System.out.println("Testing '7' : ");
    System.out.println("Is Letter : " + Character.isLetter(digit));                     // false
    System.out.println("Is Digit : " + Character.isDigit(digit));                       // true

    System.out.println("Testing 'A' : ");
    System.out.println("Is uppercase? : " + Character.isUpperCase(letter));             // true
    System.out.println("To lowercase : " + Character.toLowerCase(letter));              // a

    System.out.println("Testing 'a' : ");
    System.out.println("Is lowercase? : " + Character.isLowerCase(lowercase));          // true
    System.out.println("To uppercase : " + Character.toUpperCase(lowercase));           // A

    System.out.println("Other tests : ");
    System.out.println("Is whitespace? : " + Character.isWhitespace(whitespace));       // true
    System.out.println("To uppercase : " + Character.isLetterOrDigit(whitespace));      // false

    int num = 42;
    Integer objNum = num;   // Autoboxing
    int num2 =  objNum;     // Unboxing

    Integer nullNum = null;
    int value = nullNum;    // throws a NullPointerException

}