public class _1SwitchStatement {

    public static void main(String[] args) {
        // ISO_8601
        // Monday (1) to Sunday (7)
        int day = 6;
        String result;

        switch (day) {
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Weekday";
        }

        System.out.println(result); // Saturday
    }
}
