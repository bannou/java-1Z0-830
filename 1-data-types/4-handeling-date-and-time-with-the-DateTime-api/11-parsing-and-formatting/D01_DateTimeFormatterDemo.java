import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class D01_DateTimeFormatterDemo {
    public static void main(String[] args) {
        // Define a fixed LocalDate for consistent output
        LocalDate ldt = LocalDate.of(2025, 1, 20);
        System.out.println("LocalDate: " + ldt);
        
        // --- Predefined Formatter ---
        System.out.println("\n--- Using Predefined Formatter ---");
        System.out.println("DateTimeFormatter.ISO_DATE.format(ldt): " + DateTimeFormatter.ISO_DATE.format(ldt));
        System.out.println("ldt.format(DateTimeFormatter.ISO_DATE): " + ldt.format(DateTimeFormatter.ISO_DATE));
        // Expected Output: 2025-01-20 (ISO 8601 format)

        // --- Localized Formatting (Short Style) ---
        DateTimeFormatter localizedFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        
        System.out.println("\n--- Using Localized Formatter (SHORT Style) ---");
        System.out.println("Using default locale: " + localizedFormatter.format(ldt));
        System.out.println("Using default locale (alternative syntax): " + ldt.format(localizedFormatter));
        System.out.println("Using German locale: " + localizedFormatter.withLocale(Locale.GERMAN).format(ldt));
        // Expected Output (varies by system locale, assuming US default):
        // US: 1/20/25
        // German: 20.01.25 (dd.MM.yy format)

        // --- Custom Pattern Formatting ---
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("QQQQ Y");

        System.out.println("\n--- Using Custom Pattern Formatter ---");
        System.out.println("Using default locale: " + customFormatter.format(ldt));
        System.out.println("Using default locale (alternative syntax): " + ldt.format(customFormatter));
        System.out.println("Using German locale: " + customFormatter.withLocale(Locale.GERMAN).format(ldt));
        // Expected Output:
        // US: 1st quarter 2025
        // German: 1. Quartal 2025
    }
}
