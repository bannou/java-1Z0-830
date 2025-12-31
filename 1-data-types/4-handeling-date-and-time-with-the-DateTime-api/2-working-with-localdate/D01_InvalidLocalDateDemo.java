import java.time.LocalDate;

public class D01_InvalidLocalDateDemo {
    public static void main(String[] args) {
        // Attempting to create a LocalDate for 
        // February 29 in a non-leap year (2023)
        LocalDate invalidDate = LocalDate.of(
            2023, 2, 29
        );
        System.out.println("Date created: " + invalidDate);
    }
}
