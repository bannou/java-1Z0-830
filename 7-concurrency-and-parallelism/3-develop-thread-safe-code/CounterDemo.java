import java.util.ArrayList;
import java.util.List;

public class CounterDemo {
    private static final int ITERATIONS = 1000000;
    private static int counter = 0;

    private static Object lock = new Object();

    private static class ThreadExample implements Runnable {
        private String name;

        public ThreadExample(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < ITERATIONS; i++) {
                synchronized (lock) {
                    counter++;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(new ThreadExample("t" + i)));
        }
        System.out.println("Starting threads");
        for (int i = 0; i < 100; i++) {
            threads.get(i).start();
        }
        try {
            for (int i = 0; i < 100; i++) {
                threads.get(i).join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter=" + counter);
    }

}
