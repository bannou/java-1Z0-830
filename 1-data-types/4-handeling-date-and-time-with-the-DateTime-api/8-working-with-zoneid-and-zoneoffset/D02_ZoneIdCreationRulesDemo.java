import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.zone.ZoneRulesException;

public class D02_ZoneIdCreationRulesDemo {
    public static void main(String[] args) {
        try {
            // Rule 1: If zone ID is "Z", it is equivalent to UTC
            System.out.println("Z -> " + ZoneId.of("Z"));                               // Equivalent to ZoneOffset.UTC

            // Rule 2: If the zone ID starts with + or -, it is parsed as a ZoneOffset
            System.out.println("+02:00 -> " + ZoneId.of("+02:00"));                     // Equivalent to ZoneOffset.of("+02:00")
            System.out.println("-05:00 -> " + ZoneId.of("-05:00"));                     // Equivalent to ZoneOffset.of("-05:00")

            // Rule 3: GMT, UTC, and UT are treated as equivalent to UTC
            System.out.println("GMT -> " + ZoneId.of("GMT"));                           // GMT
            System.out.println("UTC -> " + ZoneId.of("UTC"));                           // UTC
            System.out.println("UT -> " + ZoneId.of("UT"));                             // UT

            // Rule 4: Prefixes like UTC+, UTC-, GMT+, GMT-, UT+ and UT-
            System.out.println("UTC+05:30 -> " + ZoneId.of("UTC+05:30"));               // UTC+05:30
            System.out.println("GMT-03:00 -> " + ZoneId.of("GMT-03:00"));               // GMT-03:00
            System.out.println("UT+01:00 -> " + ZoneId.of("UT+01:00"));                 // UT+01:00

            // Rule 5: Region-based zone IDs (e.g., "America/New_York", "Asia/Tokyo")
            System.out.println("America/New_York -> " + ZoneId.of("America/New_York")); // America/New_York
            System.out.println("Asia/Tokyo -> " + ZoneId.of("Asia/Tokyo"));             // Asia/Tokyo

            // Invalid cases that will throw exceptions
            try {
                System.out.println("Invalid Zone ID 'X' -> " + ZoneId.of("X"));
            } catch (DateTimeException e) {
                System.out.println("Exception: Invalid Zone ID 'X' - " + e.getMessage());
            }

            try {
                System.out.println("Invalid Zone ID 'Foo/Bar' -> " + ZoneId.of("Foo/Bar"));
            } catch (ZoneRulesException e) {
                System.out.println("Exception: Invalid Zone ID 'Foo/Bar' - " + e.getMessage());
            }

        } catch (DateTimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
