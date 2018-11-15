package concurrent.cyclicBarrierdemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        CyclicBarrier cb = new CyclicBarrier(3, new Thread("barrierAction") {
            public void run() {
                System.out.print(Thread.currentThread().getName() + " barrier action" + "\n");
            }
        });
        MyThread t1 = new MyThread("t1", cb);
        MyThread t2 = new MyThread("t2", cb);
        t1.start();
        t2.start();
        System.out.print(Thread.currentThread().getName() + " going to await" + "\n");
        cb.await();
        System.out.print(Thread.currentThread().getName() + " continue" + "\n");
    }

}
