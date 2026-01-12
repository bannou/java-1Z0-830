package ps.control.m3;

public class _7PatternMatchingSwitch {

    public static void main(String[] args) {

        if(Integer.valueOf(12) instanceof Integer i && i > 10) {

        }
        describeNumber(null);
    }

    static void describeNumber(Number input) {

        String message = switch (input) {
            case Integer i when i < 10  -> "...";
            case Integer i              -> "Whole: " + i;  // match all ints here
//            case Double d               -> "Exact: " + d;
//            case Number n               -> "Unknown: " + n;  // dominates
//            case null -> "null!";
            case null, default -> "Unknown";
        };
        System.out.print(message);
    }

    class Vehicle {}
    class Car extends Vehicle {}
    class Dog {}

    void describeVehicle(Vehicle vehicle) {
        String msg = switch (vehicle) {
            case Car c -> "Car";
            case Vehicle a -> "Unknown";
        };
    }
}
