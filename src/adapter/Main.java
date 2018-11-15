package adapter;

/**
 * Created by huangzhihao on 2018/10/9.
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
