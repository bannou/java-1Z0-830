public class D02_EscapingCharactersTextBlockDemo {
    public static void main(String[] args) {
        // Defining a multi-line HTML template using a text block
        String htmlTemplate = """
                              <!DOCTYPE html>
                              <html>
                                <head>
                                  <title>Example</title>
                                </head>
                                <body>
                                  <h1>Welcome to "MySite"</h1>
                                  <p>This is an example with a backslash: \\</p>
                                  <p>Special character: \u0040 (which is '@')</p>
                                  <p>Triple quotes inside text block: \"""escaped triple quotes\"""</p>
                                </body>
                              </html>
                              """;

        // Printing the HTML template with a descriptive message
        System.out.println("Generated HTML Template:");
        System.out.println(htmlTemplate);
    }
}
