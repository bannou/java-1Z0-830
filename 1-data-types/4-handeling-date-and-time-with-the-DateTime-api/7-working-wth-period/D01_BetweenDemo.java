import java.time.*;

public class D01_BetweenDemo {
    public static void main(String[] args) {
        // Creating two Instants
        Instant start = Instant.ofEpochSecond(123456789);
        Instant end = Instant.ofEpochSecond(99999);

        // Calculating the duration between the two Instants
        Duration diff = Duration.between(end, start);

        // Printing the duration
        System.out.println("Duration between instants:");
        System.out.println("Seconds: " + diff.getSeconds());
        System.out.println("Nanoseconds: " + diff.getNano());
    }
}
