public class D06_BitwiseLogicalDemo {
    public static void main(String[] args) {
        int a = 10;  // 1010 in binary
        int b = 6;   // 0110 in binary

        System.out.println("Bitwise Operations:");
        System.out.println("a & b  (AND)  = " + a + " & " + b + " = " + (a & b));           // 2
        System.out.println("a | b  (OR)   = " + a + " | " + b + " = " + (a | b));           // 14
        System.out.println("a ^ b  (XOR)  = " + a + " ^ " + b + " = " + (a ^ b));           // 12

        System.out.println("\nLogical Operations:");
        System.out.println("(a > 5 && b < 10)  = " + (a > 5 && b < 10));                    // true
        System.out.println("(a > 5 || b < 5)   = " + (a > 5 || b < 5));                     // true
    }
}
