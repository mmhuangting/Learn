package decorate;

/**
 * Created by huangzhihao on 2018/3/23.
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("xiao huang");
        XiZhuang xiZhuang = new XiZhuang();
        Shirts shirts = new Shirts();
        xiZhuang.Decorate(person);
        shirts.Decorate(xiZhuang);
        shirts.show();
    }
}
