import java.time.*;

public class D03_DurationBetweenDifferentTypesDemo {
    public static void main(String[] args) {
        // Define a LocalTime and a LocalDateTime
        LocalTime time = LocalTime.of(12, 0, 0); // 12:00 PM
        LocalDateTime dateTime = LocalDateTime.of(2024, 2, 11, 14, 30, 0); // 2024-02-11 14:30:00

        // Calculate duration using LocalTime as the first argument
        Duration duration = Duration.between(time, dateTime);

        // Print the result
        System.out.println("Duration: " + duration);
        System.out.println("Seconds: " + duration.getSeconds());
        System.out.println("Minutes: " + duration.toMinutes());
        
        try {
            // Invalid, throws a DateTimeException
            Duration invalidDuration = Duration.between(dateTime, time);
            System.out.println("Invalid Duration: " + invalidDuration);
        } catch (DateTimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
