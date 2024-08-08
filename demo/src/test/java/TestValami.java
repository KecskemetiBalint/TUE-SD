import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import pattern.Singleton.SingletonLazy;

public class TestValami {

    private static final int THREADS = 4;

    private void uniqueTest() {
        Thread[] threads = new Thread[THREADS];
        final SingletonLazy[] sing = new SingletonLazy[THREADS * 2];
        for (int i = 0; i < THREADS; i++) {
            final int current = i;
            threads[current] = new Thread() {
                @Override
                public void run() {
                    sing[current * 2] = SingletonLazy.getInstance();
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                    }
                    sing[current * 2 + 1] = SingletonLazy.getInstance();
                }
            };
        }
        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join(0);
            } catch (Exception e) {
            }

        }

        for (int i = 0; i < sing.length - 1; i++) {
            assertEquals(sing[i].toString() + sing[i + 1].toString(), sing[i], sing[i + 1]);
        }
    }

    @RepeatedTest(3000)
    public void syncTest() {
        SingletonLazy.instance = null;
        uniqueTest();
    }

    private static int x = 0;

    @RepeatedTest(1)
    public void threadTest() {
        x = 0;
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            final int current = i;
            threads[current] = new Thread() {
                @Override
                public void run() {

                    try {
                        for (int j = 0; j < 100; j++) {
                            ++x;
                        }
                        Thread.sleep(1);
                    } catch (Exception ex) {
                    }
                }
            };
        }
        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join(0);
            } catch (Exception e) {
            }
        }
        
        assertEquals(10000, x);
    }

}
