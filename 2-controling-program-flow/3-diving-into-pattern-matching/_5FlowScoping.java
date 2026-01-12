public class _5FlowScoping {

    public static void main(String[] args) {

        Number number = 145;

        if (number instanceof Integer i)
            System.out.print(i.intValue());
//      System.out.print(i.intValue());  // cannot resolve 'i'

    }
}
