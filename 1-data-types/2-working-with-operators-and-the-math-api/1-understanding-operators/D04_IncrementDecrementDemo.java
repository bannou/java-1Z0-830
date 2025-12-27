public class D04_IncrementDecrementDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = ++a * b--; // a is pre-incremented before multiplication, b is post-decremented after multiplication

        System.out.println("After operations:");
        System.out.println("a (after ++a) = " + a);                     // 6
        System.out.println("b (after b--) = " + b);                     // 9
        System.out.println("c (computed as ++a * b--) = " + c);         // 60
    }
}
