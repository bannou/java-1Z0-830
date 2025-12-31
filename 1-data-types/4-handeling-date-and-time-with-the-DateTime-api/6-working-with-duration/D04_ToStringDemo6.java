import java.time.Period;

public class D04_ToStringDemo6 {
    public static void main(String[] args) {
        // Example with years, months, and days
        Period period5y4m3d = Period.of(5, 4, 3);
        System.out.println("Period 5 years, 4 months, 3 days: " + period5y4m3d.toString());     // P5Y4M3D

        // Example with only months and days
        Period period0y2m10d = Period.of(0, 2, 10);
        System.out.println("Period 2 months, 10 days: " + period0y2m10d.toString());            // P2M10D

        // Example with only days
        Period period0y0m15d = Period.ofDays(15);
        System.out.println("Period 15 days: " + period0y0m15d.toString());                      // P15D

        // Example of a zero period (P0D)
        Period zeroPeriod = Period.of(0, 0, 0);
        System.out.println("Zero period: " + zeroPeriod.toString());                            // P0D
    }
}
