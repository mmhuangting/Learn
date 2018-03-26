package decorate;

/**
 * Created by huangzhihao on 2018/3/23.
 */
public class XiZhuang extends Decorator {

    @Override
    public void show() {
        System.out.print("西装 ");
        super.show();
    }
}
