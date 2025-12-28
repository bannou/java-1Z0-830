public class D01_StringBuilderDemo {
    public static void main(String[] args) {
        // Step 1: Initialize StringBuilder with "Hello"
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial value: " + sb);

        // Step 2: Append " there" → Now contains "Hello there"
        sb.append(" there");
        System.out.println("After append: " + sb);

        // Step 3: Insert a comma at index 5 → Now contains "Hello, there"
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Step 4: Replace "there" (index 7 to 12) with "world" → Now contains "Hello, world"
        sb.replace(7, 12, "world");
        System.out.println("After replace: " + sb);

        // Step 5: Delete the comma and space (index 5 to 7) → Now contains "Helloworld"
        sb.delete(5, 7);
        System.out.println("After delete: " + sb);

        // Step 6: Reverse the string → Now contains "dlrowolleH"
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Step 7: Convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Final string: " + finalString);
    }
}
