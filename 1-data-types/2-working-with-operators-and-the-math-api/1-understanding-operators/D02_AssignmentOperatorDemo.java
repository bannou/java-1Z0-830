public class D02_AssignmentOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = (a = 3) + (b = 5);

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);           // a = 3, b = 5, c = 8
    }
}
