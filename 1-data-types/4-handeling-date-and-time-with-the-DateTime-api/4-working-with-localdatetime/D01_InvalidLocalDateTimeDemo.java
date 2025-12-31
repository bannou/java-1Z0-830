import java.time.LocalDateTime;

public class D01_InvalidLocalDateTimeDemo {
    public static void main(String[] args) {
        // Case 1: Invalid date (February 29 on a non-leap year)
        try {
            LocalDateTime invalidDate = LocalDateTime.of(
                2023, 2, 29, 12, 0
            );
            System.out.println("Created LocalDateTime: " + invalidDate);
        } catch (Exception e) {
            System.out.println("Exception thrown (invalid date): " + e.getMessage());
        }

        // Case 2: Invalid time (Hour 24 does not exist)
        try {
            LocalDateTime invalidTime = LocalDateTime.of(
                2024, 5, 10, 24, 0
            );
            System.out.println("Created LocalDateTime: " + invalidTime);
        } catch (Exception e) {
            System.out.println("Exception thrown (invalid time): " + e.getMessage());
        }
    }
}
