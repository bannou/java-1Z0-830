public class _62PracticeQuestions {

    public static void main(String[] args) {

        // Question 1
        int skips = 10;  // Type 'Object' in question - and it doesn't compile
        switch (skips) {
            case 1 -> System.out.println("a");
            default -> System.out.println("b");
        }

        // Question 2 - 2 reasons not to compile - missing default and extra semicolon in yield line
        int category = 4;
        var type = switch (category) {
            case 1, 2 -> "Guitar";
            case 3, 4 -> "Piano";
            case 5 -> "Violin";
//            case 6 -> { yield "Triangle"; };
            default -> "";
        };
        System.out.println(type);


        // Question 3
        new TransportHub().printLocation(TransportHub.Vehicle.BOAT);  // 2


        // Question 4
        byte fruit = 2;
        String name = "Banana";
        String color = switch (fruit) {
            case 1 -> { yield "Red"; }
            case 2 -> { if (name.equals("Lime"))
                yield "Green";
                yield "Yellow"; }
            case 3 -> "Purple";
            default -> throw new RuntimeException();
        };
        System.out.print(color);

    }

    static class TransportHub {
        enum Vehicle { CAR, BOAT }

        void printLocation(Vehicle v) {
            byte type = switch (v) {
                case CAR -> 1;
                case BOAT -> 2;
                default -> 3;
            };
            System.out.println(type);
        }
    }
}
