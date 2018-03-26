package decorate;

/**
 * Created by huangzhihao on 2018/3/23.
 */
public class Shirts extends Decorator {

    @Override
    public void show() {
        System.out.print("衬衫 ");
        super.show();
    }
}
