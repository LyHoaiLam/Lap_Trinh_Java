package onlaibaihoc.hinhdang;

public class AmoeBa_OnLai extends HinhDang
{
    private double x, y;

    public void setX(double x) 
    {
        this.x = x;
    }

    public void setY(double y) 
    {
        this.y = y;
    }

    public AmoeBa_OnLai()
    {

    }
    
    @Override
    public void Rotate() 
    {
        System.out.println("Rotate X = " + this.x + " And " + " Rotate Y = " + this.y);
        super.PlaySound();
        
    }
}
