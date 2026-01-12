public class _6Summary {

    public static void main(String[] args) {

        int a = 1;
        if (a == 0)  // '==', not '='
            System.out.println("inside");
            System.out.println("outside 'if' block");

        // ternary expression must return a value
        var b = a < 2 ? "must be" : "same type";

        System.out.println(b);
    }

    void doThing(String arg, final String finalArg) {

        final String finalVar = "b";

        String localVar = "a";
        final String fetched = getString();

        // allowed: byte, short, int, char, String, enum
        switch (arg) {
            // 2+ cases for a single block allowed
            case "literal 1":
            case "literal 2":
                // code
                break;

            case "literal 3":
                // missing break

            case finalVar:
                // code
                break;

//            case 5: // wrong data type
                // code
//                break;

// constant expression required for below
//            case localVar:
////                 code
//                break;

//            case finalArg:
                // code
//                break;

//            case fetched:  // constant expression required
                // code
//                break;
        }

    }

    private String getString() {
        return null;
    }
}
