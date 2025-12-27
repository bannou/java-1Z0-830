public class D02_IncrementDecrementDemo {
    public static void main(String[] args) {
        // First example
        int a = 5;
        int b = ++a + a++;

        System.out.println("After first operation (b = ++a + a++):");
        System.out.println("a = " + a);                     // 7
        System.out.println("b = " + b);                     // 12
        System.out.println();

        // Second example
        int c = 5;
        int result = ++c + c++ + c--;

        System.out.println("After second operation (result = ++c + c++ + c--):");
        System.out.println("c = " + c);                     // 6
        System.out.println("Expression result: " + result); // 19
    }
}