public class _2SwitchStatementCaseDefault {

    public static void main(String[] args) {
        // ISO_8601
        // Monday (1) to Sunday (7)
        int day = 6;
        String result = null;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "Weekday";
                break;
            case 6:
            case 7:
                result = "Weekend";
                break;
        }

        System.out.println(result); // Saturday
    }
}
