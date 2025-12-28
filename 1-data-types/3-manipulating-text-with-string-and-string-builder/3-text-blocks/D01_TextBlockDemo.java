public class D01_TextBlockDemo {
    public static void main(String[] args) {
        // Traditional String
        String traditional = "  \n  ";  
        
        // Text Block
        String textBlock = """
                             \n  
                           """;  
        
        // Printing results with brackets to visualize spaces
        System.out.println("Traditional String ([space][space][\\n][space][space]): [" + traditional + "]");
        System.out.println("Text Block String ([space][space][\\n][\\n]): [" + textBlock + "]");

        // Showing length for verification
        System.out.println("Length of Traditional String: " + traditional.length());
        System.out.println("Length of Text Block String: " + textBlock.length());
    }
}
