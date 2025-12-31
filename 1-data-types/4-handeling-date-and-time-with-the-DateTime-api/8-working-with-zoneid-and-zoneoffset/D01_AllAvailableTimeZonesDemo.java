import java.time.ZoneId;
import java.util.Set;

public class D01_AllAvailableTimeZonesDemo {
    public static void main(String[] args) {
        // Get all available zone IDs
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Print each zone ID to the console
        zoneIds.forEach(System.out::println);
    }
}
