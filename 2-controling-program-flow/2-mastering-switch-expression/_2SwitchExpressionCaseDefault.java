public class _2SwitchExpressionCaseDefault {

    public static void main(String[] args) {
        // ISO_8601
        // Monday (1) to Sunday (7)
        int day = 6;
        var result = switch (day) {
            case 1,2,3,4,5  -> "Weekday";
            case 6,7        -> "Weekend";
            default         -> "Invalid number";
        };

        System.out.println(result);

        var season = Season.WINTER;
        String result2 = switch (season) {
            case WINTER -> "C-c-c-cold!";
            case SPRING -> "Still cold!";
            case SUMMER -> "I'm melting!";
            case FALL -> "Pretty leaves!";
        };

    }

    enum Season {
        WINTER, SPRING, SUMMER, FALL
    }
}
