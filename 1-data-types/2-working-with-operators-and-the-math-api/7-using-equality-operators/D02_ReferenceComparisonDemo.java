public class D02_ReferenceComparisonDemo {
    public static void main(String[] args) {
        // Creating two String objects with the same content
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // Using '==' to compare references
        boolean result = (s1 == s2); // false

        // Printing results with explanation
        System.out.println("s1 = new String(\"Hello\");");
        System.out.println("s2 = new String(\"Hello\");");
        System.out.println("(s1 == s2): " + result);
    }
}
