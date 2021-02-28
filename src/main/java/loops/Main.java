package loops;

public class Main {

    private Main() {

    }

    public static int task1(int value) {

        int sum = 0;
        if (value <= 0) throw new IllegalArgumentException();
        while (value > 0)
        {
            sum += value%10 * (value%2);
            value = value/10;
        }
        return sum;
    }


    public static int task2(int value) {
        int count = 0;
        if (value <= 0) throw new IllegalArgumentException();
        while (value > 0)
        {
            count += value & 1;
            value >>= 1;
        }
        return count;
    }

    public static int task3(int value) {
        int[] a = new int[value];

        if (value <= 0) throw new IllegalArgumentException();

        else if (value <= 1)
        {
            return 0;
        }
        else
        {
            a[0] = 0;
            a[1] = 1;
            int sum = 1;
            for (int i = 2; i < value; i++)
            {
                a[i] = a[i - 2] + a[i - 1];
                sum += a[i];
            }
            return sum;
        }
    }
}

