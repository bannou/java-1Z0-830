package ps.control.m2;

public class _4SwitchYield {

    private static int getDistance() {
        return 1; // astronomical units
    }

    public static void main(String[] args) {

        int planetNumber = 5;

        var name = switch (planetNumber) {

            case 1 -> "Mercury";

            case 2 -> {yield "Venus";}

            case 3 -> {
                var distanceFromSun = getDistance();
                if(distanceFromSun == 1) yield "Earth";
                else yield "Mars";
            }

            case 5 -> throw new RuntimeException("Jupiter is BIG! This is too much!");

            case 6 -> {
                // some other code
                throw new RuntimeException("Saturn is also BIG!");
            }

            default -> "Too far away, can't be bothered";
        };
    }
}
