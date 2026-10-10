import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SynchronizedCollectionDemo {

    private static final int ITERATIONS = 1000;

    private static List<Integer> integersList = Collections.synchronizedList(new ArrayList<>());
//    private static List<Integer> integersList = new CopyOnWriteArrayList<>();

    private static class IntegerGenerator implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                integersList.add(new Random().nextInt(10));
            }
        }
    }

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < ITERATIONS; i++) {
            threads.add(new Thread(new IntegerGenerator()));
        }
        System.out.println("Starting threads");
        for (int i = 0; i < ITERATIONS; i++) {
            threads.get(i).start();
        }
        System.out.println("Waiting for threads");
        try {
            for (int i = 0; i < ITERATIONS; i++) {
                threads.get(i).join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(integersList.size());
    }
}