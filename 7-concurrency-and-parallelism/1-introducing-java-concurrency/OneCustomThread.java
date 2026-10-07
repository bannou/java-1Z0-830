public class OneCustomThread {
    private static class ThreadExample implements Runnable {
        private String name;

        public ThreadExample(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println("Sleeping for 2 seconds");
                Thread.sleep(2000);
                System.out.println("Wake up!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(name + ":" + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadExample("t"));

        System.out.println("Starting thread");
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of main");
    }

}