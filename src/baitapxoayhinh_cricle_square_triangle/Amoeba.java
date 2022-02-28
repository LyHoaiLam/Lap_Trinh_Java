package baitapxoayhinh_cricle_square_triangle;

public class Amoeba extends Shape
{
    //String soundFile;

    // Tọa độ điểm
    private double xPoint;
    private double yPoint;

    Amoeba()
    {
        
    }

    public void setXPoint(double xPoint)
    {
        this.xPoint = xPoint;
    }

    public void setYPoint(double yPoint)
    {
        this.yPoint = yPoint;
    }

   



    /*public Amoeba(String soundFile)
    {
        this.soundFile = soundFile;
    }  */  

    /*public Amoeba(String soundFile, double x, double y)
    {
        this(soundFile);
        this.xPoint = x;
        this.yPoint = y;
    }*/
    void RotateAmoeba()
    {
        System.out.println("Xoay 360 at xPoint: "+ this.xPoint +" yPoint: "+ this.yPoint);
        this.PlaySound();// Có thể đem mothod khác vào method khác để sử dụng
    }

    void PlaySoundAmoeba()
    {
        System.out.println("play SoundFile:: "+ this.getSoundFile());
    }
}
