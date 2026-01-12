public class _1PatternMatchingBeforeAfter {

    public static void main(String[] args) {

        // Without Pattern Matching
        Integer obj = 5;

        if (obj instanceof Integer) {
            Integer i = obj; // Explicit cast
            System.out.println(i.intValue());
        }

        // With Pattern Matching
        Object obj2 = 5;
        if (obj2 instanceof Integer i) {
            System.out.println(i.intValue());
        }
    }
}
