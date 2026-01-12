public class _2PatternMatchingElseIf {

    public static void main(String[] args) {

        // Parent of Integer, Double, Long, etc.
        Number num = 5L;

        if (num instanceof Integer i) {
            System.out.println("int: " + i.intValue());
        } else if (num instanceof Double d) {
            System.out.println(d.compareTo(5d)); // 0 if equal
        } else {
            System.out.println("short: " + num.shortValue());
        }
    }
}
