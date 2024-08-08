package pattern.Threading;

public class ThreadingClient {
    final static int THREADS = 4;

    public static void run() {
        //1
        for (int i = 0; i < THREADS; i++) {
            MyThread thread = new MyThread();
            thread.start(); // we execute a thread by calling start()
        }

        //2
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        //3
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getId() + " i:" + i + " reports running");
                }
            }
        };
        thread1.start();

    }
}
