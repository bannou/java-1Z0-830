public class D01_ArithmeticOperationsDemo {
    public static void main(String[] args) {
        // Basic arithmetic operations
        int a = 10, b = 20;
        int sum = a + b;
        int difference = b - a;
        int product = a * b;

        System.out.println("Basic Arithmetic Operations:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum (a + b): " + sum);                                                                                  // 30
        System.out.println("Difference (b - a): " + difference);                                                                    // 10
        System.out.println("Product (a * b): " + product);                                                                          // 200
        System.out.println("----------------------------------------");

        // Integer division
        int c = 10, d = 3;
        int quotientInt = c / d;

        System.out.println("Integer Division:");
        System.out.println("c = " + c + ", d = " + d);
        System.out.println("Quotient (c / d): " + quotientInt + " (integer division, decimal part is lost)");                       // 3
        System.out.println("----------------------------------------");

        // Floating-point division
        int e = 10;
        float f = 3.0f;
        double quotientDouble = e / f;

        System.out.println("Floating-Point Division:");
        System.out.println("e = " + e + ", f = " + f);
        System.out.println("Quotient (e / f): " + quotientDouble);                                                                  // 3.3333332538604736
        System.out.println("----------------------------------------");

        // Modulus operation
        int g = 10, h = 3;
        int remainder = g % h;

        System.out.println("Modulus Operation:");
        System.out.println("g = " + g + ", h = " + h);
        System.out.println("Remainder (g % h): " + remainder);                                                                      // 1
        System.out.println("----------------------------------------");

        // Floating-point precision issue
        double i = 0.1, j = 0.2;
        double sumDouble = i + j;

        System.out.println("Floating-Point Precision Issue:");
        System.out.println("i = " + i + ", j = " + j);
        System.out.println("Sum (i + j): " + sumDouble + " (Due to floating-point representation, result is slightly off)");        // 0.30000000000000004
        System.out.println("----------------------------------------");
    }
}
