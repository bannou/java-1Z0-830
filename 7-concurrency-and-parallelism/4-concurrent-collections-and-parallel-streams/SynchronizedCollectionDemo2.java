import java.util.*;

public class SynchronizedCollectionDemo2 {

    private static final int ITERATIONS = 1000;

    private static List<Integer> integersList = Collections.synchronizedList(new ArrayList<>());
//    private static List<Integer> integersList = new CopyOnWriteArrayList<>();

    private static Object monitor = new Object();

    private static class IntegerGenerator implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                synchronized (monitor) {
                    integersList.add(new Random().nextInt(10));
                    print(integersList);
                }
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

    private static void print(Collection<?> c) {
        StringBuilder builder = new StringBuilder();
        Iterator<?> iterator = c.iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next()).append(" ");
        }
        // log(builder.toString());
    }
}