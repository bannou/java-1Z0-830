public class _4SwitchStatementConstantExpression {

    void doThing(String arg, final String finalArg) {
        String localVar = "a";
        final String finalVar = "b";
        switch (arg) {
            case "Test":
                // code
                break;
            case finalVar:
                // code
                break;
// below does not compile
//            case localVar:
//                // code
//                break;
//
//            case finalArg:
//                // code
//                break;
//            case 5:
//                // code
//                break;
        }
    }
}
