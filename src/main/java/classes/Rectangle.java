package classes;

public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double a, double b)
    {
        sideA = a;
        sideB = b;
    }
    public Rectangle(double a)
    {
        sideA = a;
        sideB = 5;
    }
    public Rectangle()
    {
        sideA = 4;
        sideB = 3;
    }
    public void setSideA(double sideA)
    {
        this.sideA = sideA;
    }
    public void setSideB(double sideB)
    {
        this.sideB = sideB;
    }
    public double getSideA()
    {
        return sideA;
    }
    public double getSideB()
    {
        return sideB;
    }

    public double area()
    {
        double a = sideA;
        double b = sideB;
        return a * b;
    }
    public double perimeter()
    {
        double a = sideA;
        double b = sideB;
        return (a + b) *2;
    }
    public boolean isSquare()
    {
        double a = sideA;
        double b = sideB;
        return a == b;
    }

    public void replaceSides()
    {
        double temp;
        temp = sideA;
        sideA = sideB;
        sideB = temp;
    }

}

