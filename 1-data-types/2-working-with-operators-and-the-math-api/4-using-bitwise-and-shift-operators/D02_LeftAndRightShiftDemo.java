public class D02_LeftAndRightShiftDemo {
    public static void main(String[] args) {
        // Example with a positive number
        int num1 = 5; // Binary: 00000000 00000000 00000000 00000101
        int leftShift1 = num1 << 2; // Shift left by 2 positions

        // Example with a negative number
        int num2 = -5; // Binary (two's complement): 11111111 11111111 11111111 11111011
        int leftShift2 = num2 << 2; // Shift left by 2 positions

        // Right shift examples
        int signedRightShift = num2 >> 2;  // Signed right shift (preserves sign)
        int unsignedRightShift = num2 >>> 2; // Unsigned right shift (fills with 0s)

        // Display results
        System.out.println("Original number (5): " + num1 + " -> Binary: " + Integer.toBinaryString(num1));
        System.out.println("5 << 2 (Shift left by 2): " + leftShift1 + " -> Binary: " + Integer.toBinaryString(leftShift1));
        System.out.println();

        System.out.println("Original number (-5): " + num2 + " -> Binary: " + Integer.toBinaryString(num2));
        System.out.println("-5 << 2 (Shift left by 2): " + leftShift2 + " -> Binary: " + Integer.toBinaryString(leftShift2));
        System.out.println();

        System.out.println("-5 >> 2 (Signed right shift): " + signedRightShift + " -> Binary: " + Integer.toBinaryString(signedRightShift));
        System.out.println("-5 >>> 2 (Unsigned right shift): " + unsignedRightShift + " -> Binary: " + Integer.toBinaryString(unsignedRightShift));
    }
}
