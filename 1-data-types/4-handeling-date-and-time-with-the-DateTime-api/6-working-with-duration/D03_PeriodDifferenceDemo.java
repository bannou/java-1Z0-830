import java.time.LocalDate;
import java.time.Period;

public class D03_PeriodDifferenceDemo {
    public static void main(String[] args) {
        // Define date pairs and calculate periods
        LocalDate start1 = LocalDate.of(2000, 2, 10);
        LocalDate end1 = LocalDate.of(2001, 4, 12);
        Period diff1 = Period.between(start1, end1);

        LocalDate start2 = LocalDate.of(2013, 5, 9);
        LocalDate end2 = LocalDate.of(2013, 6, 3);
        Period diff2 = Period.between(start2, end2);

        LocalDate start3 = LocalDate.of(2014, 11, 3);
        LocalDate end3 = LocalDate.of(2012, 10, 31);
        Period diff3 = Period.between(start3, end3);

        // Print results
        System.out.println("Period between " + start1 + " and " + end1 + " -> " + formatPeriod(diff1));
        System.out.println("Period between " + start2 + " and " + end2 + " -> " + formatPeriod(diff2));
        System.out.println("Period between " + start3 + " and " + end3 + " -> " + formatPeriod(diff3));
    }

    // Helper method to format period output
    private static String formatPeriod(Period period) {
        return String.format("%d years, %d months, %d days",
                period.getYears(), period.getMonths(), period.getDays());
    }
}
