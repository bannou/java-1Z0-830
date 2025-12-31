import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class D02_InvalidChronoFieldDemo4 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 2, 11, 14, 30, 45);

        // Case 1: Using an unsupported ChronoField
        try {
            // ChronoField.OFFSET_SECONDS is not supported
            int offsetSeconds = dateTime.get(ChronoField.OFFSET_SECONDS);
            System.out.println("Offset seconds: " + offsetSeconds);
        } catch (Exception e) {
            System.out.println("Exception thrown (unsupported field): " + e.getMessage());
        }

        // Case 2: Value too large for int (NANO_OF_DAY returns long)
        try {
            // ChronoField.NANO_OF_DAY is too large for int
            int nanoDay = dateTime.get(ChronoField.NANO_OF_DAY);
            System.out.println("Nano of the day: " + nanoDay);
        } catch (Exception e) {
            System.out.println("Exception thrown (value out of int range): " + e.getMessage());
        }
    }
}
