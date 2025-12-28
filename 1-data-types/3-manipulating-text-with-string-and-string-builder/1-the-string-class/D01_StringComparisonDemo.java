public class D01_StringComparisonDemo {
    public static void main(String[] args) {
        // String literals are stored in the string pool
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("s1 and s2 are string literals and refer to the same memory location:");
        System.out.println("s1 == s2: " + (s1 == s2)); // true
        
        // Creating a new String object using the 'new' keyword
        String s3 = new String("Hello");
        System.out.println("s3 is created using 'new', so it is a different object:");
        System.out.println("s1 == s3: " + (s1 == s3)); // false
        
        // Interning s3 to store it in the string pool
        String s4 = s3.intern();
        System.out.println("s4 is the interned version of s3, now pointing to the same memory location as s1:");
        System.out.println("s1 == s4: " + (s1 == s4)); // true
    }
}
