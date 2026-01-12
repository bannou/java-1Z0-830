package ps.control.m5;

public class _3Break {

    public static void main(String[] args) {

        int[][] nestedArray = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        OUTER: for (int i = 0; i < nestedArray.length; i++) {

            INNER: for (int j = 0; j < nestedArray[i].length; j++) {
                if (nestedArray[i][j] == 3) {
                    break OUTER;
                }
                System.out.print(nestedArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("End of loop");
    }
}
