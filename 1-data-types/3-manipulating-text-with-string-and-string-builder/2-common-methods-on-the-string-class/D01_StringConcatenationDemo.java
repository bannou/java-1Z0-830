public class D01_StringConcatenationDemo {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "Alice";
        
        // Using concat() method (Less readable and cumbersome)
        String result1 = greeting.concat(", ").concat(name).concat("!");
        System.out.println("Using concat() method: " + result1); // Output: Hello, Alice!

        // Using + Operator (More concise and preferred)
        String result2 = greeting + ", " + name + "!";
        System.out.println("Using + operator: " + result2); // Output: Hello, Alice!
    }
}
