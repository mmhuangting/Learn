package probability;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by huangzhihao on 2018/1/31.
 */
public class Main {

    public static void main(String[] args) {
       List<String> data = new ArrayList();
       for(int i = 0; i < 1000; i++) {
           int value = newRand(1000, 500, 800);
           int[] container  = new int[]{i+1, value};
           System.out.print(Arrays.toString(container) + ",\n");
       }

    }

    public static int rand7() {
       /* int ran;
        while((ran = rand5()*5+rand5())>=21);//如果产生的数大于20那么就重复再取数
        return ran/3;*/
       return rand5()+rand5()/2;
    }
    public static int rand5() {
        Random random = new Random();
        return random.nextInt(5);
    }

    public static int newRand(int num, int start, int end)
    {
        double d = Math.log(num)/Math.log(2);
        int result = 0;
        for(int i = 0; i <= d; ++i)
        {
            if(Rand() == 1)
                result |= (1<<i);
        }
        if(result > end || result < start)
            return newRand(num, start, end);
        return result;
    }

    public static int Rand()
    {
        Random random = new Random();
        return random.nextInt(2);
    }
}
