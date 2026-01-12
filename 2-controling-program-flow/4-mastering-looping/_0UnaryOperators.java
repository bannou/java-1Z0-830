public class _0UnaryOperators {

    public static void main(String[] args) {

        int a = 1, b = 3;
        int x = 0;
        int y = 0;
        while (a < 3) { // 2 iterations
            x = a++;
            y = --b;
        }
        System.out.println(x);
        System.out.println(y);


        int e = 5;
        double f = 2 + 2 * e--;

        System.out.println(f); // 12.0
        System.out.println(e); // 4
    }
}
