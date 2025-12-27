public class D07_TernaryOperatorDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int max = (x > y) ? x : y;

        System.out.println("Values: x = " + x + ", y = " + y);                  // x = 10, y = 20
        System.out.println("Maximum value using ternary operator: " + max);     // 20
    }
}
