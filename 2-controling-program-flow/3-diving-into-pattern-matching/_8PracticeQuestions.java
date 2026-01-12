public class _8PracticeQuestions {


    public static void main(String[] args) {

        // Question 4
        checkNumber(1);

        // Question 5
        makeMovement(null);


        // Question 6
        String status = "Closed";
        int code = switch (status) {
            case String s when s.equals("Open") -> 10;
            case Object s when !"".equals(s) -> 20;
            case null -> {yield 30;}
            default -> 40;
        };
        System.out.print(code); // 20


        // Question 7 - fails to compile because of invalid "case default"
        enum DoorState { OPEN, CLOSED, LOCKED }

        DoorState state = DoorState.CLOSED;
        int code2 = switch (state) {
            case DoorState s when s == DoorState.OPEN -> 10;
            case null  -> 20;
            /* case */ default -> {
                throw new RuntimeException("Boom!");
            }
        };
        System.out.print(code2);
    }


    private static void checkNumber(Integer num) {
        var result = switch (num) {
            case Integer i -> "Integer: " + i;
//            case 0 -> "Zero";
//            default -> "Other number";
        };
        System.out.println(result);
    }

    private static void makeMovement(Object o) {
        var output = switch (o) {
//            case Object obj -> "object";
            case null -> "null";
            default -> "default";
        };
        System.out.println(output);
    }
}
