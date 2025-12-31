import java.time.*;

public class D02_NegativeDurationDemo {
    public static void main(String[] args) {
        // Creating two Instants where end is 100 nanoseconds before start
        Instant start = Instant.ofEpochSecond(
            0, 500
        );
        Instant end = Instant.ofEpochSecond(
            0, 400
        ); // 100 nanoseconds before start

        // Calculating the duration between the two Instants
        Duration diff = Duration.between(start, end);

        // Printing the duration
        System.out.println("Duration between instants:");
        System.out.println("Seconds: " + diff.getSeconds());
        System.out.println("Nanoseconds: " + diff.getNano());
    }
}
