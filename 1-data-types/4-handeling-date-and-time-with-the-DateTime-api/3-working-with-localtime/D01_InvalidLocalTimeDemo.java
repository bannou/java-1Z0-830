import java.time.LocalTime;

public class D01_InvalidLocalTimeDemo {
    public static void main(String[] args) {
        // Attempting to create an invalid LocalTime (24:00 is not valid)
        LocalTime invalidTime = LocalTime.of(24, 0);
        System.out.println("Time created: " + invalidTime);
    }
}
