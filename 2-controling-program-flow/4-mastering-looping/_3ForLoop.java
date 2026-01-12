public class _3ForLoop {

    public static void main(String[] args) {

        for(long x = 1, y = 13;
            x < 2 || y > 10;
            x++, y--) {
            System.out.println(x + "-" + y);
        }
    }
}
