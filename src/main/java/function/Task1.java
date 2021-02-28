package function;

import static function.SortOrder.ASC;
import static function.SortOrder.DESC;

public class Task1 {

    private Task1(){

    }

    public static boolean isSorted(int[] array, SortOrder order) {

        if(array == null){
            throw new IllegalArgumentException();
        }
        else
        if (order == ASC) {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    return false;
                }
            }
            return true;
        } else
        if(order == DESC) {
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}

