public class _4ConditionalClause {

    public static void main(String[] args) {

        String input = "hi";

        if (input instanceof String s && s.equals("bye") && s.length() > 1)
            System.out.println(s);


        Number num = null;
        if (num instanceof Double d && d < 20)
            System.out.println(d);
    }
}
