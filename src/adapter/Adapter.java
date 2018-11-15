package adapter;

/**
 * Created by huangzhihao on 2018/10/9.
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
