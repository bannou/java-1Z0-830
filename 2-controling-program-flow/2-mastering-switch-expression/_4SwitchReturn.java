public class _4SwitchReturn {

    public static void main(String[] args) {

        System.out.println(doThing());
    }

    static String doThing() {
        final var x = "a";

        switch (x) {
            case "a":
                return "first letter";
            default:
                return "not first letter";
        }

//        System.out.println(); // unreachable
    }
}
