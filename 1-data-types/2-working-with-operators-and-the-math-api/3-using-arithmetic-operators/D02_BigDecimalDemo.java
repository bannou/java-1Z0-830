import java.math.BigDecimal;
import java.math.RoundingMode;

public class D02_BigDecimalDemo {
    public static void main(String[] args) {
        // Using BigDecimal with String constructor to ensure precise representation
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");

        // Display the initial values
        System.out.println("Using BigDecimal for precise decimal calculations:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Perform addition
        BigDecimal sum = a.add(b);

        // Print the precise result
        System.out.println("\nPerforming addition: a + b");
        System.out.println("Expected result: 0.3");
        System.out.println("BigDecimal computed result: " + sum);                               // 0.3

        // Demonstrate rounding to two decimal places
        BigDecimal roundedSum = sum.setScale(2, RoundingMode.HALF_UP);

        System.out.println("\nRounding to two decimal places (HALF_UP mode):");
        System.out.println("Rounded result: " + roundedSum + " (Maintains precision)");         // 0.30
    }
}
