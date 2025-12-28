public class D02_StringChainingDemo {
    public static void main(String[] args) {
        String result = "  hello world  ".trim()
                        .substring(2, 11)
                        .replace("l", "L")
                        .toUpperCase()
                        .concat("!!!")
                        .replace("E", "3")
                        .replace("O", "0")
                        .concat(" MORE TEXT")
                        .substring(5)
                        .trim();

        System.out.println(result); // Hard to predict output!
    }
}
