public class _2DoWhile {

    public static void main(String[] args) {

        // produces the same output as the 'while' loop
        // in all cases except when daysLeft = 0
        int daysLeft = 3;
        int daysWorked = 0;
        do {
            System.out.println("work");
            daysLeft--;
            daysWorked++;
        } while (daysLeft > 0);
        System.out.println(daysWorked);

    }
}
