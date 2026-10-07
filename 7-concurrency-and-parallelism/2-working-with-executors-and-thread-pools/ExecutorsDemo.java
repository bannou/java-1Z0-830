import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ExecutorsDemo {
    private static class IntegerGenerator implements Runnable {

        @Override
        public void run() {
            int number = new Random().nextInt(10);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread is finished, number: " + number);
        }
    }

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();

        List<Future<?>> results = new ArrayList<>();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(3); // with more workers available, the completion take place before the first inspection

        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new IntegerGenerator()));
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Future<?> result : results) {
            System.out.print(result.isDone() + " ");
        }
        System.out.println();

        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Future<?> result : results) {
            System.out.print(result.isDone() + " ");
        }
        System.out.println();

        System.out.println("Time of work: " + Duration.between(start, LocalDateTime.now()).getNano() / 1000000 + " milliseconds");

    }
}
