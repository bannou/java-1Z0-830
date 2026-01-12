public class _1WhileLoop {

    public static void main(String[] args) {

        // simple while loop
        int daysLeft = 3;
        int daysWorked = 0;
        while (daysLeft > 0) {
            System.out.println("work");
            daysLeft--;
            daysWorked++;
        }
        System.out.println(daysWorked);

        // more complex while loop
        int energyPointsLeft = 3;
        int hoursLeft = 3;
        int hoursWorked = 0;
        while (energyPointsLeft > 0 || hoursLeft >= 0) {
            energyPointsLeft--;
            hoursLeft--;
            hoursWorked++;
        }
        System.out.println(hoursWorked);
    }
}
