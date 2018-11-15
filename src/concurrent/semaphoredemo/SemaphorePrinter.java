package concurrent.semaphoredemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by huangzhihao on 2018/11/7.
 */
public class SemaphorePrinter {

    /**
     * 信号控制量
     */
    private Semaphore semaphore;

    /**
     * 空闲打印者数组
     */
    private boolean[] freePrinters;

    /**
     * 控制访问空闲打印者
     */
    private Lock lockPrinters;

    private final SimpleDateFormat sdf = new SimpleDateFormat("mm:ss.SSS");

    public SemaphorePrinter() {
        semaphore = new Semaphore(3);
        freePrinters = new boolean[3];
        for(int i=0; i<3; i++) {
            freePrinters[i] = true;
        }
        lockPrinters = new ReentrantLock();
    }

    public void printJob() {
        String threadName = Thread.currentThread().getName();
        try {
            semaphore.acquire();//获取信号量
            System.out.print(threadName + "获取信号量at" + sdf.format(new Date()));
            System.out.print("\n");
            int assignPrinter = getPrinter();//获取空闲打印者
            Long duration = (long) (Math.random() * 10);
            System.out.print(threadName + "获取空闲打印者" + assignPrinter + "打印了" + duration + "秒");
            System.out.print("\n");
            TimeUnit.SECONDS.sleep(duration);
            //打印结束，归还打印者
            freePrinters[assignPrinter] = true;
            System.out.print(semaphore.getQueueLength());
            System.out.print("\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(threadName + " 释放信号量  at : " + sdf.format(new Date()) + "\r\n");
            semaphore.release();
        }
    }

    private int getPrinter() {
        int result = -1;

        try {
            lockPrinters.lock();
            for(int i = 0; i < freePrinters.length; i++) {
                if(freePrinters[i]) {
                    result = i;
                    freePrinters[i] = false;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lockPrinters.unlock();
        }

        return result;
    }

}
