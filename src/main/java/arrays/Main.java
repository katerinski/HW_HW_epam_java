package arrays;

public class Main {

    private Main(){

    }

    public static int[] task1(int[] array) {
        int n = array.length;
        int temp;
        int i;
        int j;

        for (i = 0 , j = n-1; i < n / 2; i++ , j--)
        {
            if (array[i] % 2 == 0 && array[j] % 2 == 0)
            {
                temp = array[i];
                array[i] = array[n-i-1];
                array[n-i-1] = temp;
            }
        }
        return array;
    }


    public static int task2(int[] array) {
        int n = array.length;
        int max = 0;
        int max1 = 0;
        int firstIndex = 0;
        int lastIndex = 0;

        for (int i = 0; i < n; i++)
        {
            if (max < array[i] && array[i] % 2 == 0) {
                max = array[i];
                firstIndex = i;
            }
        }

        for (int i = n-1; i >= 0; i--)
        {
            if (max1 < array[i] && array[i] % 2 == 0) {
                max1 = array[i];
                lastIndex = i;
            }
        }
        return lastIndex - firstIndex;
    }

    public static int[][] task3(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {

                if (i > j)
                {
                    matrix[i][j] = 0;
                }
                else if (i < j)
                {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

}

