public class D03_IntegerOverflowDemo {
    public static void main(String[] args) {
        // Integer Overflow
        int a = Integer.MAX_VALUE, b = 1;
        int sumOverflow = a + b;

        System.out.println("Integer Overflow:");
        System.out.println("a = Integer.MAX_VALUE = " + a + ", b = " + b);                                          //  = Integer.MAX_VALUE = 2147483647, b = 1
        System.out.println("Sum (a + b): " + sumOverflow + " (Overflow! Result wraps around to negative)");         // -2147483648
    }
}
