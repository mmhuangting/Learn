package concurrent.cyclicBarrierdemo;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

    private CyclicBarrier cb;
    public MyThread(String name, CyclicBarrier cb) {
        super(name);
        this.cb = cb;
    }

    public void run() {
        System.out.print(Thread.currentThread().getName() + " going to await" + "\n");
        try {
            cb.await(5, TimeUnit.SECONDS);
            System.out.print(Thread.currentThread().getName() + " continue" + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
