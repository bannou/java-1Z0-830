public class _2Labels {

    public static void main(String[] args) {

        int[][] nestedArray = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        OUTER: for (int i = 0; i < nestedArray.length; i++) {
            INNER: for (int j = 0; j < nestedArray[i].length; j++) {
                System.out.print(nestedArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("End of loop");
    }
}
