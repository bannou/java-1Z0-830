public class D02_OperatorPrecedenceDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("Initial values:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        
        // First evaluate !a, then b && c, finally OR the results
        boolean result = !a || b && c;
        
        System.out.println("\nExpression: !a || b && c");
        System.out.println("Step 1: !a = " + !a);
        System.out.println("Step 2: b && c = " + (b && c));
        System.out.println("Final result = " + result);
    }
}
