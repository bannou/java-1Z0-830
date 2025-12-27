public class D01_ShiftOperatorDemo {
    public static void main(String[] args) {
        // Declare a byte variable
        byte a = 8;

        // Attempting to store the result of shift operation in a byte (Compilation Error)
        // byte b = a << 1; // Uncommenting this will cause a compilation error

        // Correct approach: store the result in an int
        int c = a << 1;

        // Display values
        System.out.println("Original value (a): " + a);
        System.out.println("Result of a << 1 stored in an int (c): " + c);

        // Workaround: Explicit casting to byte
        byte d = (byte) (a << 1);
        System.out.println("Result after explicit casting to byte (d): " + d);
    }
}
