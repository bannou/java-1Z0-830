public class _5SwitchTricks {

    public static void main(String[] args) {

        printWeather(2);
    }

    static void printWeather(int weatherType) {

        switch (weatherType) {
            case 1 -> System.out.print("Sunny");
            case 2 -> System.out.print("Cloudy");
            case 3 -> System.out.print("Rain");
        }
    }

    // Usual:
    // :  in SS
    // -> in SE

    // Possible:
    // : and -> in SS
    // : in SE with yield
}
