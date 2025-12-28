public class D03_StringIndexDemo {
    public static void main(String[] args) {
        String text = "Java";

        // Getting characters by index
        char firstChar = text.charAt(0);                        // 'J'
        char lastChar = text.charAt(text.length() - 1);         // 'a'

        // Finding the index of a character
        int indexOfV = text.indexOf('v');                       // 2

        // Extracting a substring using indexes
        String sub = text.substring(1, 3);                      // "av"

        // Displaying results
        System.out.println("Original String: " + text);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
        System.out.println("Index of 'v': " + indexOfV);
        System.out.println("Substring from index 1 to 3: " + sub);
    }
}
