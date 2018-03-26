package character;

/**
 * Created by huangzhihao on 2018/1/31.
 */
public class Main {

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }

    public static int lengthOfLongestSubstring(String s) {
        int data = 0;
        char[] chars = s.toCharArray();
        if(chars != null && chars.length > 0) {
            for(int i = 0; i < chars.length; i++) {
                for(int j = i+1; j < chars.length; j++) {

                }
            }
        }
        return data;
    }
}
