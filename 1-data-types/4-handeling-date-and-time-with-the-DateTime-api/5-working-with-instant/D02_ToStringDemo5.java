import java.time.Instant;

public class D02_ToStringDemo5 {
    public static void main(String[] args) {
        // Case 1: Instant with nanoseconds
        Instant instantWithNano = Instant.ofEpochSecond(1700000000, 123456789);
        System.out.println("With nanoseconds: " + instantWithNano);

        // Case 2: Instant without nanoseconds (zero nanos)
        Instant instantWithoutNano = Instant.ofEpochSecond(1700000000, 0);
        System.out.println("Without nanoseconds: " + instantWithoutNano);
    }
}
