public class TryCatchFlowOne {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        try {
            sb.append("a");  // yes
        } catch (Exception e) {
            sb.append("b");  // skip
        } finally {
            sb.append("c");  // yes
        }
        sb.append("d");  // yes

        System.out.println(sb);
    }
}
