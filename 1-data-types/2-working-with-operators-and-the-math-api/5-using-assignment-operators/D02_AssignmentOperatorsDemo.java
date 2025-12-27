public class D02_AssignmentOperatorsDemo {
    public static void main(String[] args) {
        // Example 1: Type Casting (Explicit Conversion)
        double a = 3.9999;
        int b = (int) a; // Casting double to int truncates the decimal part

        System.out.println("Type Casting:");
        System.out.println("Original double value: " + a);
        System.out.println("After casting to int: " + b + " (Decimal part is truncated)");
        System.out.println("----------------------------------------");

        // Example 2: Multiple Assignments
        int x, y, z;
        x = y = z = 10; // Assigning the same value to multiple variables

        System.out.println("Multiple Assignments:");
        System.out.println("x = y = z = 10;");
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("----------------------------------------");

        // Example 3: Operator Precedence in Multiplication Assignment
        int num = 10;
        num *= 5 + 2; // Equivalent to num = num * (5 + 2)
        System.out.println("Multiplication Assignment:");
        System.out.println("num = 10; num *= 5 + 2;");
        System.out.println("New value of num: " + num + " (10 * (5 + 2) = 70)");

        num = 10;
        num = num * 5 + 2; // Equivalent to (10 * 5) + 2
        System.out.println("\nWithout Compound Operator:");
        System.out.println("num = 10; num = num * 5 + 2;");
        System.out.println("New value of num: " + num + " ((10 * 5) + 2 = 52)");
        System.out.println("----------------------------------------");

        // Example 4: Post-Increment vs. Pre-Increment in Compound Assignment
        int val = 5;
        val += val++; // val = val + val (before incrementing val)
        System.out.println("Post-Increment in Compound Assignment:");
        System.out.println("val = 5; val += val++;");
        System.out.println("New value of val: " + val + " (5 + 5, then val is incremented)");
        
        val = 5;
        val += ++val; // val = val + (val + 1)
        System.out.println("\nPre-Increment in Compound Assignment:");
        System.out.println("val = 5; val += ++val;");
        System.out.println("New value of val: " + val + " (5 + 6, since val is first incremented)");
        System.out.println("----------------------------------------");
    }
}
