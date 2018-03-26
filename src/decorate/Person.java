package decorate;

/**
 * Created by huangzhihao on 2018/3/23.
 */
public class Person implements Wear {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
    public void show() {
        System.out.print("装扮：" + name);
    }
}
