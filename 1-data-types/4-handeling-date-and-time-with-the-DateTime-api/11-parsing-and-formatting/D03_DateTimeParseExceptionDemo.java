import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class D03_DateTimeParseExceptionDemo {
    public static void main(String[] args) {
        // Example 1: Trying to parse a ZonedDateTime 
        // with missing time zone information
        try {
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(
                "2023-12-03T10:15:30"
            );
            System.out.println("Parsed ZonedDateTime: " + zonedDateTime);
        } catch (DateTimeParseException e) {
            System.out.println("DateTimeParseException: " + e.getMessage());
        }

        // Example 2: Trying to parse using a formatter
        // with an incorrect pattern
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern(
            "yyyy/MM/dd HH:mm:ss"
        );
        try {
            LocalDateTime customParsed = LocalDateTime.parse(
                "2023-12-03T10:15:30", customFormatter
            );
            System.out.println("Parsed LocalDateTime with custom pattern: " + customParsed);
        } catch (DateTimeParseException e) {
            System.out.println("DateTimeParseException: " + e.getMessage());
        }
    }
}
