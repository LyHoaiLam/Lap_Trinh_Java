package baitapxoayhinh_cricle_square_triangle;

public class Amoeba 
{
    //Attribute
    String soundFile;

    // Tọa độ điểm
    double xPoint;
    double yPoint;

    // method
    Amoeba()
    {
        
    }

    public Amoeba(String soundFile)
    {
        this.soundFile = soundFile;
    }    

    public Amoeba(String soundFile, double x, double y)
    {
        this(soundFile);
        this.xPoint = x;
        this.yPoint = y;
    }

    void Rotate()
    {
        System.out.println("Xoay 360 at xPoint: "+ this.xPoint +" yPoint: "+ this.yPoint);
        this.PlaySound();// Có thể đem mothod khác vào method khác để sử dụng
    }

    void PlaySound()
    {
        System.out.println("play SoundFile:: "+ this.soundFile);
    }
}
