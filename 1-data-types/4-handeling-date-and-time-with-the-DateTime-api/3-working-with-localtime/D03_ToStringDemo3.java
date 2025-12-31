import java.time.LocalTime;

public class D03_ToStringDemo3 {
    public static void main(String[] args) {
        // Full time with hours, minutes, seconds, and nanoseconds
        LocalTime fullTime = LocalTime.of(14, 30, 45, 123456789);
        System.out.println("Full time: " + fullTime); // Expected: 14:30:45.123456789

        // Time without nanoseconds
        LocalTime noNano = LocalTime.of(14, 30, 45);
        System.out.println("No nanoseconds: " + noNano); // Expected: 14:30:45

        // Time without seconds and nanoseconds
        LocalTime noSeconds = LocalTime.of(14, 30);
        System.out.println("No seconds/nanoseconds: " + noSeconds); // Expected: 14:30
    }
}
