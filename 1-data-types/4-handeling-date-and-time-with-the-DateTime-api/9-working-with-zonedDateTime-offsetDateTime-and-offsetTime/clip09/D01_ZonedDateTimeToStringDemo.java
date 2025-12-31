import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class D01_ZonedDateTimeToStringDemo {
    public static void main(String[] args) {
        // Case 1: UTC time (Z offset, ZoneId omitted because it's redundant)
        System.out.println(
            ZonedDateTime.of(2024, 9, 19, 0, 30, 0, 0, ZoneId.of("Z"))                      // 2024-09-19T00:30Z
        ); 

        // Case 2: A region-based ZoneId different from the offset
        System.out.println(
            ZonedDateTime.now(ZoneId.of("America/Montreal"))                                                                                        // 2025-12-30T09:39:15.448098-05:00[America/Montreal]

        ); 

        // Case 3: A positive offset without a named region
        System.out.println(
            ZonedDateTime.of(2024, 3, 15, 14, 0, 0, 0, ZoneOffset.of("+02:00"))             // 2024-03-15T14:00+02:00
        ); 

        // Case 4: A named region that follows a reversed sign convention
        System.out.println(
            ZonedDateTime.of(2024, 3, 15, 14, 0, 0, 0, ZoneId.of("Etc/GMT+2"))              // 2024-03-15T14:00-02:00[Etc/GMT+2]
        ); 

        // Case 5: A time with non-zero nanoseconds
        System.out.println(
            ZonedDateTime.of(2024, 12, 5, 23, 59, 59, 123456789, ZoneId.of("Asia/Tokyo"))   // 2024-12-05T23:59:59.123456789+09:00[Asia/Tokyo]
        ); 

        // Case 6: A time with zero parts
        System.out.println(
            ZonedDateTime.of(2024, 1, 1, 0, 0, 0, 0, ZoneId.of("Europe/London"))            // 2024-01-01T00:00Z[Europe/London]
        ); 
    }
}
