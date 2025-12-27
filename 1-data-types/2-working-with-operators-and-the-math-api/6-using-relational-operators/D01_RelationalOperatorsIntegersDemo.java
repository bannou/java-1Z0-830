public class D01_RelationalOperatorsIntegersDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a = " + a + ", b = " + b);

        boolean result1 = (a < b);  
        boolean result2 = (a > b);  
        boolean result3 = (a <= b); 
        boolean result4 = (a >= b); 

        System.out.println("(a < b): " + result1);              // true
        System.out.println("(a > b): " + result2);              // false
        System.out.println("(a <= b): " + result3);             // true
        System.out.println("(a >= b): " + result4);             // false
    }
}
