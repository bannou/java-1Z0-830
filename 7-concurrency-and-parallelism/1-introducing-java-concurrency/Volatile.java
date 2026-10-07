public class Volatile {

    private static StringBuffer result = new StringBuffer();

    private static volatile boolean running = true;  // volatile prevents optimization = every thread have a copy of the value in its L3 cache
                                                     // otherwise it will run infinitely

    private static void log(String s) {
        result.append(s + "\n");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int counter = 0;
                while(running){
                    counter ++;
                }
                log("thread 1 finished. Count up to " + counter);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                running = false;
                log("thread 2 finished");
            }
        });

        System.out.println("Starting threads");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of main");

        System.out.println(result);
    }
}
