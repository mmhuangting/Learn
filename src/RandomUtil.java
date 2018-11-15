import java.util.Random;

/**
 * Created by huangzhihao on 2018/7/10.
 */
public class RandomUtil {

    private static String random_s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String testRandom1(int length) throws Exception {
        char[] c = random_s.toCharArray();
        Random random = new Random();
        String data = "";
        for( int i = 0; i < length; i ++) {
            data = data + c[random.nextInt(c.length)];
        }
        return data;
    }

    public static String randomInt(int length) {
        double m = Math.pow(10, length-1);
        return (int)((Math.random()*9+1)*m) + "";
    }

    public static void main(String[] args) throws Exception {
        System.out.print(randomInt(6));
    }
}
