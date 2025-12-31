import java.time.*;

public class D03_DSTAdjustmentDemo {
    public static void main(String[] args) {
        // Case 1: One hour before DST starts in Italy
        // (March 31, 2024, 01:00 AM CET, UTC+1)
        ZonedDateTime zdt = ZonedDateTime.of(
            2024, 3, 31, 1, 0, 0, 0,
            ZoneId.of("Europe/Rome")
        );
        System.out.println("Original ZonedDateTime: " + zdt);                                       // 2024-03-31T01:00+01:00[Europe/Rome]

        // Case 2: Adding a Duration of 1 day (exactly 24 hours)
        ZonedDateTime zdtDuration = zdt.plus(Duration.ofDays(1));
        System.out.println("After adding Duration.ofDays(1): " + zdtDuration);                      // 2024-04-01T02:00+02:00[Europe/Rome]

        // Case 3: Adding a Period of 1 day (conceptual date change)
        ZonedDateTime zdtPeriod = zdt.plus(Period.ofDays(1));
        System.out.println("After adding Period.ofDays(1): " + zdtPeriod);                          // 2024-04-01T01:00+02:00[Europe/Rome]
    }
}
