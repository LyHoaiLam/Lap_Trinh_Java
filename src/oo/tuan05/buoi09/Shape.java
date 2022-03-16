package oo.tuan05.buoi09;

abstract public class Shape 
{
    protected int x, y;

    Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }   

    abstract public void Draw();
    abstract public void Erase();

    public void MoveTo( int _x, int _y)
    {
        Erase();
        this.x = _x;
        this.y = _y;
        Draw();
    }

    
    
}
