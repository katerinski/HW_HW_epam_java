package classes;

public class ArrayRectangles {

    private Rectangle[] rectangle_array;

    public ArrayRectangles() {

    }

    public ArrayRectangles(int n)
    {
        rectangle_array = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle ... rectangles)
    {
        rectangle_array = rectangles;
    }

    public boolean addRectangle(Rectangle rectangle)
    {
        for (int i = 0; i < rectangle_array.length; i++)
            if (rectangle_array[i] == null)
            {
                rectangle_array[i] = rectangle;
                return true;
            }
        return false;
    }

    public int numberMaxArea()
    {
        int number = 0;
        double maxArea = 0;
        for (int i = 0; i < rectangle_array.length; i++)
            if (rectangle_array[i] != null && maxArea < rectangle_array[i].area())
            {
                maxArea = rectangle_array[i].area();
                number = i;
            }

        return number;
    }

    public int numberMinPerimeter()
    {
        int number = 0;
        double minPerimeter = 0;
        for (int i = 0; i < rectangle_array.length; i++)
            if (rectangle_array[i] != null && minPerimeter > rectangle_array[i].perimeter())
            {
                minPerimeter = rectangle_array[i].perimeter();
                number = i;
            }
        return number;
    }

    public int numberSquares()
    {
        int number = 0;
        for (int i = 0; i < rectangle_array.length; i++)
            if (rectangle_array[i] != null && rectangle_array[i].isSquare())
                number++;
        return number;
    }

}

