public class _1NestedLoops {

    public static void main(String[] args) {

        int[][] nestedArray = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Loop over the  rows
        for (int i = 0; i < nestedArray.length; i++) {

            // Loop over all elements of the current row
            for (int j = 0; j < nestedArray[i].length; j++) {
                System.out.print(nestedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
