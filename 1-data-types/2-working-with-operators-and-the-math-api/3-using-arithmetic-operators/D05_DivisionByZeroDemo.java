public class D05_DivisionByZeroDemo {
    public static void main(String[] args) {
        // Example 1: Integer Division by Zero (Throws ArithmeticException)
        try {
            int a = 10, b = 0;
            System.out.println("Attempting integer division: " + a + " / " + b);
            int result = a / b; // This line will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide an integer by zero! (ArithmeticException thrown)");
        }

        System.out.println("----------------------------------------");

        // Example 2: Floating-Point Division by Zero (Does NOT throw an exception)
        double x = 10.0, y = 0.0;
        System.out.println("Attempting floating-point division: " + x + " / " + y);
        double resultDouble = x / y; // Produces Infinity

        System.out.println("Result: " + resultDouble);
        if (Double.isInfinite(resultDouble)) {
            System.out.println("Explanation: In floating-point arithmetic, dividing by zero results in Infinity.");
        }

        System.out.println("----------------------------------------");

        // Example 3: Zero divided by Zero in Floating-Point (Results in NaN)
        double z = 0.0;
        System.out.println("Attempting 0.0 / 0.0 in floating-point division:");
        double nanResult = z / y; // Produces NaN

        System.out.println("Result: " + nanResult);
        if (Double.isNaN(nanResult)) {
            System.out.println("Explanation: 0.0 / 0.0 results in NaN (Not-a-Number), which means the result is undefined.");
        }
    }
}
