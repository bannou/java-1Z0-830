public class D03_EqualsMethodDemo {
    public static void main(String[] args) {
        // Creating two String objects with the same content
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // Using 'equals()' to compare contents
        boolean result = s1.equals(s2); // true

        // Printing results with explanation
        System.out.println("s1 = new String(\"Hello\");");
        System.out.println("s2 = new String(\"Hello\");");
        System.out.println("s1.equals(s2): " + result);
    }
}
