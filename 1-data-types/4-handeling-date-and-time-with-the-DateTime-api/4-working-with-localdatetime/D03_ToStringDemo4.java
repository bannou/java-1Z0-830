import java.time.LocalDateTime;

public class D03_ToStringDemo4 {
    public static void main(String[] args) {
        // Full date-time with nanoseconds
        LocalDateTime fullDateTime = LocalDateTime.of(2024, 2, 11, 14, 30, 45, 123456789);
        System.out.println("Full date-time: " + fullDateTime); // Expected: 2024-02-11T14:30:45.123456789

        // Without nanoseconds
        LocalDateTime noNano = LocalDateTime.of(2024, 2, 11, 14, 30, 45);
        System.out.println("No nanoseconds: " + noNano); // Expected: 2024-02-11T14:30:45

        // Without seconds and nanoseconds
        LocalDateTime noSeconds = LocalDateTime.of(2024, 2, 11, 14, 30);
        System.out.println("No seconds/nanoseconds: " + noSeconds); // Expected: 2024-02-11T14:30
    }
}
