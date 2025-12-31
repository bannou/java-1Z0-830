import java.time.*;

public class D02_OffsetClassesCreationDemo {
    public static void main(String[] args) {
        // OffsetDateTime: March 15, 2024, at 14:30 with UTC+03:00 offset
        OffsetDateTime odt = OffsetDateTime.of(
            LocalDateTime.of(2024, 3, 15, 14, 30), 
            ZoneOffset.of("+03:00")
        );

        // OffsetTime: 09:15 with UTC-08:00 offset
        OffsetTime ot = OffsetTime.of(
            LocalTime.of(9, 15), 
            ZoneOffset.of("-08:00")
        );

        System.out.println(odt); // Expected output: 2024-03-15T14:30+03:00
        System.out.println(ot); // Expected output: 09:15-08:00
    }
}
