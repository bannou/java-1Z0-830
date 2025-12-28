public class D04_StringMethodsDemo {
    public static void main(String[] args) {
        String text = "Java Programming";

        // Replace 'a' with '@'
        String replacedText = text.replace('a', '@');   // J@v@ Progr@mming

        // Convert to uppercase
        String upperText = text.toUpperCase();                          // JAVA PROGRAMMING

        // Convert to lowercase
        String lowerText = text.toLowerCase();                          // java programming

        // Display results
        System.out.println("Original String: " + text);
        System.out.println("After replace: " + replacedText);
        System.out.println("Uppercase: " + upperText);
        System.out.println("Lowercase: " + lowerText);
    }
}
