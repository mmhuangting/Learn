package singleton;

/**
 * Created by huangzhihao on 2018/3/26.
 * 饿汉单例模式
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
