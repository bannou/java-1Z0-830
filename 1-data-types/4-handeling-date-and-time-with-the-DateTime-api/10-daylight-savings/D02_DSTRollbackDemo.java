import java.time.*;

public class D02_DSTRollbackDemo {
    public static void main(String[] args) {
        // Case 1: Creating a ZonedDateTime at 02:30 on October 27, 2024 (DST still active)
        ZonedDateTime zdt1 = ZonedDateTime.of(
            2024, 10, 27, 2, 30, 0, 0, 
            ZoneId.of("Europe/Rome")
        );
        System.out.println("ZonedDateTime at 02:30 before rollback (DST active): " + zdt1);                 // 2024-10-27T02:30+02:00[Europe/Rome]

        // Case 2: Adding 1 hour results in the same local time but with a different offset
        ZonedDateTime zdt2 = zdt1.plusHours(1);
        System.out.println("ZonedDateTime at 02:30 after rollback (Standard Time): " + zdt2);               // 2024-10-27T02:30+01:00[Europe/Rome]

        // Case 3: Creating a ZonedDateTime at 03:30, which is already in standard time
        ZonedDateTime zdt3 = ZonedDateTime.of(
            2024, 10, 27, 3, 30, 0, 0, 
            ZoneId.of("Europe/Rome")
        );
        System.out.println("ZonedDateTime at 03:30 (Standard Time already in effect): " + zdt3);            // 2024-10-27T03:30+01:00[Europe/Rome]
    }
}
