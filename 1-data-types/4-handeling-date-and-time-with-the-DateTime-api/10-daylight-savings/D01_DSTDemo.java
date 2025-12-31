import java.time.*;

public class D01_DSTDemo {
    public static void main(String[] args) {
        // Case 1: Creating a LocalDateTime (DST transition ignored)
        LocalDateTime ldt = LocalDateTime.of(
            2024, 3, 31, 2, 30
        );
        System.out.println("LocalDateTime (DST ignored): " + ldt);                                          // 2024-03-31T02:30
        
        // Case 2: Creating a ZonedDateTime for Rome (DST applied)
        ZonedDateTime zdt = ZonedDateTime.of(
            2024, 3, 31, 2, 30, 0, 0, 
            ZoneId.of("Europe/Rome")
        );
        System.out.println("ZonedDateTime (DST applied): " + zdt);                                          // 2024-03-31T03:30+02:00[Europe/Rome]

        // Case 3: Using a fixed ZoneOffset (No DST applied)
        ZonedDateTime zdt1 = ZonedDateTime.of(
            2024, 3, 31, 2, 30, 0, 0, 
            ZoneOffset.ofHours(2)
        );
        System.out.println("ZonedDateTime with fixed ZoneOffset '+02:00' (DST ignored): " + zdt1);          // 2024-03-31T02:30+02:00

        // Case 4: Using 'UTC+2' as ZoneId (DST ignored, treated as fixed offset)
        ZonedDateTime zdt2 = ZonedDateTime.of(
            2024, 3, 31, 2, 30, 0, 0, 
            ZoneId.of("UTC+2")
        );
        System.out.println("ZonedDateTime with 'UTC+2' (DST ignored, treated as fixed offset): " + zdt2);   // 2024-03-31T02:30+02:00[UTC+02:00]
    }
}
