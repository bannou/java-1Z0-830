import java.time.LocalTime;
import java.time.temporal.ChronoField;
public class D02_InvalidChronoFieldDemo2 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(14, 30, 45); // 14:30:45

        // Case 1: Using an unsupported ChronoField on LocalTime
        try {
            // ChronoField.DAY_OF_MONTH is invalid for LocalTime
            int dayOfMonth = time.get(ChronoField.DAY_OF_MONTH);
            System.out.println("Day of month: " + dayOfMonth);
        } catch (Exception e) {
            System.out.println("Exception thrown (unsupported field): " + e.getMessage());
        }

        // Case 2: Using get(TemporalField) where value exceeds int range
        try {
            // ChronoField.NANO_OF_DAY exceeds int range
            int nanoOfDay = time.get(ChronoField.NANO_OF_DAY);
            System.out.println("Nano of day: " + nanoOfDay);
        } catch (Exception e) {
            System.out.println("Exception thrown (value out of int range): " + e.getMessage());
        }
    }
}
