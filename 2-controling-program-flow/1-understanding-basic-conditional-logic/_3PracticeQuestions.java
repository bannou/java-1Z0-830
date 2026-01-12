public class _3PracticeQuestions {

    public static void main(String[] args) {

        question1();

        question2();

        question3();
    }

    private static void question3() {
        System.out.println("Question 3");
        int x = 1;
        int y = 2;

//      incompatible types - int vs. double
//      int z = x > y ? 2: 3.0;
//      System.out.println(z);
    }

    private static void question1() {
        System.out.println("Question 1");
        int x = 5;
        if(x < 5)
            System.out.println("a");
        x++;
        System.out.println("b");
        System.out.println(x);
    }

    private static void question2() {
        System.out.println("Question 2");
        int y = 2;
//      assignment vs. comparison
//        if(y == 2) {
//            System.out.println("a");
//            y++;
//        } else {
//            System.out.println("b");
//            System.out.println("c");
//        }
        System.out.println(y);
    }
}
