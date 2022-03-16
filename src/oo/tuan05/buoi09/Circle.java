package oo.tuan05.buoi09;

public class Circle extends Shape
{
    private int radius;
    public Circle(int _x, int _y, int _r)
    {
        super(_x, _y);
        radius = _r;// bán kính
    }

    @Override
    public void Draw() {
        System.out.println("Draw circle at " + x + "," + y);

    }

    @Override
    public void Erase() {
        System.out.println("Erase circle at " + x + "," + y);
    }
}
