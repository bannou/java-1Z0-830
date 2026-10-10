public class TryCatchFlowTwo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String str = null;
        try {
            sb.append("a");     // yes
            str.toUpperCase();  // NPE, exit
            sb.append("b");     // no
        } catch (IllegalArgumentException e) {
            sb.append("c");    // no
        } catch (Exception e) {
            sb.append("d");   // yes
        } finally {
            sb.append("e");   // yes
        }
        System.out.println(sb);
    }
}
