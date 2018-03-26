package decorate;

/**
 * Created by huangzhihao on 2018/3/23.
 */
public class Decorator implements Wear {

    private Wear wear;

    public void Decorate(Wear wear) {
        this.wear = wear;
    }

    @Override
    public void show() {
        if(wear != null) {
            wear.show();
        }
    }
}
