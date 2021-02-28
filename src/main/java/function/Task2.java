package function;

import static function.Task1.isSorted;

public class Task2 {

    private Task2(){

    }

    public static int[] transform(int[] array, SortOrder order) {


        if (isSorted(array,order))
        {
            for (int i = 1; i < array.length; i++)
            {
                array[i] = array[i] + i;
            }
        }
        return array;
    }
}

