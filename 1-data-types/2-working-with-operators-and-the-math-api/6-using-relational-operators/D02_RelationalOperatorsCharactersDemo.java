public class D02_RelationalOperatorsCharactersDemo {
    public static void main(String[] args) {
        char a = 'a', b = 'b';

        System.out.println("a = '" + a + "', b = '" + b + "'");

        // compares char based on ASCII code
        boolean result = (a < b); 

        System.out.println("(a < b): " + result);                       // true
    }
}