import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;

public class D02_DateTimeExceptionDemo {
    public static void main(String[] args) {
        // Define a LocalDate (which has no offset information)
        LocalDate localDate = LocalDate.of(
            2025, 1, 20
        );
        System.out.println("LocalDate: " + localDate);

        // Attempt to format using ISO_OFFSET_DATE 
        // (which expects an offset)
        try {
            String formattedDate = 
                DateTimeFormatter.ISO_OFFSET_DATE.format(localDate);
            System.out.println("Formatted Date: " + formattedDate);
        } catch (DateTimeException e) {
            System.out.println("DateTimeException: " + e.getMessage());
        }
    }
}
