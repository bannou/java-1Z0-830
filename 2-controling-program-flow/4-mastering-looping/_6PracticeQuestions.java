package ps.control.m4;

public class _6PracticeQuestions {

    public static void main(String[] args) {

        // question 1
        int x = 1;
        int y = 7;
        while (x > 0 && y <= 10) {
            x--;
            y++;
        }
        System.out.println(x + "-" + y);

        // question 2
        int sum = 0;
//        int a = 1;
        for(int a = 0, c = 1; a < 10; a = a + 2) {
            sum = a + c;
        }
        System.out.println(sum);

        // question 3
        int i;
        for(i = 2; i < 8; i *=2) {
            i++;
        }
        System.out.println(i);
    }
}
