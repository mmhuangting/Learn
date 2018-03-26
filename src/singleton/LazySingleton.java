package singleton;

/**
 * Created by huangzhihao on 2018/3/26.
 * 懒汉单例模式
 */
public class LazySingleton {

    private static LazySingleton instance;
    private static Object sync;

    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (sync) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
