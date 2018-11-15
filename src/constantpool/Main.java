package constantpool;

/**
 * Created by huangzhihao on 2018/11/7.
 */
public class Main {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s6 = s5.intern();
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.print(s1==s2);
        System.out.print("\n");
        System.out.print(s1==s3);
        System.out.print("\n");
        System.out.print(s1==s4);
        System.out.print("\n");
        System.out.print(s1==s5);
        System.out.print("\n");
        System.out.print(s1==s6);
        System.out.print("\n");
        System.out.print(s1==s9);
    }
}
