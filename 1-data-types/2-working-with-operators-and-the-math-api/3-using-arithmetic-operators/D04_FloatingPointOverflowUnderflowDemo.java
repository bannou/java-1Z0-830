public class D04_FloatingPointOverflowUnderflowDemo {
    public static void main(String[] args) {
        // Overflow: Exceeding the max value of double
        double overflow = Double.MAX_VALUE * 2;
        System.out.println("Double overflow result: " + overflow);              // Infinity

        // Underflow: Very small value multiplied repeatedly
        double underflow = Double.MIN_VALUE / 2;
        System.out.println("Double underflow result: " + underflow);            // 0.0

        // Example with float type as well
        float floatOverflow = Float.MAX_VALUE * 2;
        float floatUnderflow = Float.MIN_VALUE / 2;

        System.out.println("Float overflow result: " + floatOverflow);          // Infinity
        System.out.println("Float underflow result: " + floatUnderflow);        // 0.0
    }
}
