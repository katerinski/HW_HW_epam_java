package condition;

import static java.util.Arrays.sort;
import java.util.Arrays;

public class Main {

    private Main() {

    }

    public static int task1(int n) {
        int x = 0;
        if(n>0){
            x = n*n;
        }
        else {
            x = Math.abs(n);
        }
        return x;
    }

    public static int task2(int n) {

        int s = n / 100;
        int d = n % 100 / 10;
        int e = n % 10;
        int[] arr = new int[]{s,d,e};
        sort(arr);
        return Integer.parseInt(new StringBuffer(Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "")).reverse().toString());
    }

}

