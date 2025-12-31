import java.time.Duration;

public class D04_DurationToStringDemo {
    public static void main(String[] args) {
        // Define some sample durations
        Duration duration1 = Duration.ofDays(2).plusMinutes(4);
        Duration duration2 = Duration.ofSeconds(45).plusMillis(99);
        Duration duration3 = Duration.ofHours(-3).plusMinutes(-15).plusSeconds(-30);
        Duration duration4 = Duration.ofMillis(500);
        Duration duration5 = Duration.ZERO;

        // Print the durations and their string representations
        printDuration("2 days 4 minutes", duration1);
        printDuration("45 seconds 99 milliseconds", duration2);
        printDuration("-3 hours -15 minutes -30 seconds", duration3);
        printDuration("500 milliseconds", duration4);
        printDuration("Zero duration", duration5);
    }

    private static void printDuration(String description, Duration duration) {
        System.out.println(description + ": " + duration);
    }
}
