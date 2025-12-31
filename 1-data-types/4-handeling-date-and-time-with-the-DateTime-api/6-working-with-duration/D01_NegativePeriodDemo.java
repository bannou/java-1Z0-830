import java.time.LocalDate;
import java.time.Period;

public class D01_NegativePeriodDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(
            2025, 5, 20
        );

        // Negative period (-2 years, -3 months, -10 days)
        Period negativePeriod = Period.of(-2, -3, -10);

        // Apply to LocalDate (subtracts the period)
        LocalDate pastDate = today.plus(negativePeriod); // Same as today.minus(Period.of(2, 3, 10))

        System.out.println("Today: " + today);                                                                      // 2025-05-20
        System.out.println("Date after applying negative period (-2 years, -3 months, -10 days): " + pastDate);     // 2023-02-10
    }
}
