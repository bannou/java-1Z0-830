public class VirtualThreadsDemo {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Virtual Threads Demo");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        System.out.println("Starting virtual thread");

        Thread virtualThread = Thread.startVirtualThread(runnable);

//        try {
//            Thread.sleep(2000);
//            virtualThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("End of main");
    }
}
