package ps.control.m2;

public class _3PracticeQuestions {

    public static void main(String[] args) {

        // Question 1
        Object skips = 10;

        switch (skips) {
//            case 1 -> System.out.println("a");
            default -> System.out.println("b");
        }


        // Question 2
        String vehicle = "Motorcycle";
        final var truck = "Truck";
        final String bicycle = "Bicycle";

        String category = switch (vehicle) {
            case "Car", truck -> "Four-Wheeler";
            case "Motorcycle", bicycle -> "Two-Wheeler";
            case "Boat" -> "Water Vehicle";
            default -> "Unknown Category";
        };

        System.out.println(category);
    }
}
