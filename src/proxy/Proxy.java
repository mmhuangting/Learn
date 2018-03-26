package proxy;

/**
 * Created by huangzhihao on 2018/3/23.
 */
public class Proxy implements DoSomething {

    private MySelf mySelf;

    public Proxy(MySelf mySelf) {
        this.mySelf = mySelf;
    }
    @Override
    public void doAction() {
        mySelf.doAction();
    }
}
