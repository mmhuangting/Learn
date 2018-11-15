package concurrent.cyclicBarrierdemo;

import java.util.concurrent.CyclicBarrier;

public class MyThread extends Thread {

    private CyclicBarrier cb;
    public MyThread(String name, CyclicBarrier cb) {
        super(name);
        this.cb = cb;
    }

    public void run() {
        System.out.print(Thread.currentThread().getName() + " going to await" + "\n");
        try {
            cb.await();
            System.out.print(Thread.currentThread().getName() + " continue" + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
