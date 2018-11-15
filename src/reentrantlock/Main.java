package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by huangzhihao on 2018/11/6.
 */
public class Main {
    private static ReentrantLock fair = new ReentrantLock(true);//公平锁

    public static void tryLockTest() {
        Boolean b = fair.tryLock();
        if(b) {
            try {
                System.out.print("获取锁定的线程，线程id:" + Thread.currentThread().getName() + "\n");
            } finally {
                fair.unlock();
            }
        } else {
            System.out.print("已被其它线程锁定" + "\n");
        }
    }

    public static void main(String[] args) {
        for(int i=0; i<1000; i++) {
            new Thread(() -> tryLockTest()).start();
        }

    }
}
