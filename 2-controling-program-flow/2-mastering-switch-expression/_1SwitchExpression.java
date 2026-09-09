public class _1SwitchExpression {

    public static void main(String[] args) {

        // Monday (1) to Sunday (7)
        int day = 8;

        // SE not using Pattern MatchingK
        var result = switch (day) {
            default -> "Weekday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
        };

        System.out.println(result);  // Saturday
    }


    String intDayToString(int day) {

        System.out.println(switch (day) {
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Weekday";
        });

        return switch (day) {
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Weekday";
        };
    }
}
