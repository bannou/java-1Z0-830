import java.time.LocalDate;

public class D03_ToStringDemo2 {
    public static void main(String[] args) {
        // Create a LocalDate instance
        LocalDate date = LocalDate.of(2024, 2, 11);

        // Print the LocalDate using toString()
        System.out.println("Default toString() output: " + date.toString());
    }
}
