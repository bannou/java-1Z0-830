import java.util.Arrays;
import java.util.List;

public class ParallelStreamsDemo {

    public static void main(String[] args) {

        List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integersList.stream().parallel().forEach(value ->
                System.out.println(Thread.currentThread().getName() + ": " + value)
        );
    }
}
