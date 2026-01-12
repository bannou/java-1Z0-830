public class _5PracticeQuestions {

    public static void main(String[] args) {

        // question 1
        String s = "hi";
        switch (s) {
            case "HI":
            case "Hello":
                System.out.println("a");
                break;
            default:
                System.out.println("b");
                break;
        }

        // question 2
        System.out.println("Question 2");
        int i = 5;
        switch (i) {
            case 2:
                System.out.println("a");
            case 5:
                System.out.println("b");
            default:
                System.out.println("c");
                break;
        }

        System.out.println("Question 3");
        runCode("hi");
    }

    static void runCode(String arg) {
        // varOne is not final

        int x = 5; String varOne = "abc";
        switch (arg) {
            case "Test":
                System.out.println("a");
                break;
//            case varOne:
//                x++;
//                break;
        }
        System.out.println(x);
    }
}
