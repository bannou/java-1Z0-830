public class D05_CompoundAssignmentDemo {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = 1;

        x += y -= z;

        System.out.println("After operations:");
        System.out.println("x = " + x);                 // 4
        System.out.println("y = " + y);                 // 2
        System.out.println("z = " + z);                 // 1
    }
}
