package function;

public class Task3 {

    private Task3(){

    }

    public static int multiArithmeticElements(int a1, int t, int n) {

        if (n <= 0){
            throw new IllegalArgumentException();
        }

        int mult = a1;
        for (int i = 1; i < n; ++i)
        {
            a1 = a1 + t;
            mult *= a1;
        }
        return mult;
    }
}

