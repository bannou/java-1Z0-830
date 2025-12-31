import java.time.Instant;
import java.time.temporal.ChronoField;

public class D01_InvalidChronoFieldDemo {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(1_700_000_000L, 500_000_000); // Example Instant

        // Case 1: Using an unsupported ChronoField on Instant
        try {
            // ChronoField.DAY_OF_MONTH is not valid for Instant
            int dayOfMonth = instant.get(ChronoField.DAY_OF_MONTH);
            System.out.println("Day of month: " + dayOfMonth);
        } catch (Exception e) {
            System.out.println("Exception thrown (unsupported field): " + e.getMessage());
        }

        // Case 2: Getting a value that doesn’t fit into an int
        try {
            // ChronoField.INSTANT_SECONDS is too large for int
            int instantSeconds = instant.get(ChronoField.INSTANT_SECONDS);
            System.out.println("Instant seconds: " + instantSeconds);
        } catch (Exception e) {
            System.out.println("Exception thrown (value out of int range): " + e.getMessage());
        }
    }
}
