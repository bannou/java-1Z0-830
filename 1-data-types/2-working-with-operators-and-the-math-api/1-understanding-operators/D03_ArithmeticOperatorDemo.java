public class D03_ArithmeticOperatorDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        System.out.println("x + y - z = " + 
            x + " + " + y + " - " + z + " = " + (x + y - z));               // 0
        System.out.println("x - y + z = " + 
            x + " - " + y + " + " + z + " = " + (x - y + z));               // 20
        System.out.println("x * y / z = " + 
            x + " * " + y + " / " + z + " = " + (x * y / z));               // 6
        System.out.println("x / y * z = " + 
            x + " / " + y + " * " + z + " = " + (x / y * z));               // 0
    }
}
