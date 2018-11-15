package concurrent.semaphoredemo;

/**
 * Created by huangzhihao on 2018/11/7.
 */
public class Main {

    public static void main(String[] args) {
        SemaphorePrinter printer = new SemaphorePrinter();
        for(int i=0; i<8; i++) {
            new Thread(() -> {
                printer.printJob();
            }).start();
        }

    }
}
