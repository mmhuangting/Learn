import java.util.Random;

/**
 * Created by huangzhihao on 2018/5/25.
 */
public class VipMain {

    static String[] mission = {"6月", "9月", "12月"};

    public static void px() {
        String[]arr = {"王杰", "马敬强", "汪名胜"};
        final int size = 3;
        Random random = new Random();

        for(int i=0;i<size;i++){
            int p = random.nextInt(i+1);
            String tmp = arr[i];
            arr[i] = arr[p];
            arr[p] = tmp;
        }
        printArr(size, arr);
    }
    //打印
    public static void printArr(int size, String[] arr){
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+"轮到优秀:" + mission[i] + "\n");
        }
    }

    public static void main(String[] args) {
        px();
    }
}
