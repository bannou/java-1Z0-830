import java.time.LocalDate;

public class D01_ImmutableDateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 2, 10);
        System.out.println("Original date: " + date);

        // Adding 10 days creates a new instance
        LocalDate newDate = date.plusDays(10);
        System.out.println("New date after adding 10 days: " + newDate);

        // The original date remains unchanged
        System.out.println("Original date after operation: " + date);
    }
}
