import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class D02_InvalidChronoFieldDemo {
    public static void main(String[] args) {
        // Case 1: Using an unsupported ChronoField on LocalDate
        try {
            LocalDate date = LocalDate.of(
                2024, 2, 10
            );
            // ChronoField.HOUR_OF_DAY is invalid for LocalDate
            int hour = date.get(ChronoField.HOUR_OF_DAY);
            System.out.println("Hour of day: " + hour);
        } catch (Exception e) {
            System.out.println("Exception thrown (unsupported field): " + e.getMessage());
        }

        // Case 2: Using get(TemporalField) where value exceeds int range
        try {
            LocalDate farFutureDate = LocalDate.of(
                1_000_000, 1, 1 // Very large year
            ); 
            // Exceeds int range
            int epochDay = farFutureDate.get(ChronoField.EPOCH_DAY);
            System.out.println("Epoch day: " + epochDay);
        } catch (Exception e) {
            System.out.println("Exception thrown (value out of int range): " + e.getMessage());
        }
    }
}
