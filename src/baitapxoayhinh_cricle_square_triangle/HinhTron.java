package baitapxoayhinh_cricle_square_triangle;

public class HinhTron 
{
    // Attribute
    String soundFile;

    // Method
    HinhTron()
    {

    }   

    public HinhTron(String soundFile)
    {
        this.soundFile = soundFile;
    }
     
    void Rotate()
    {
       
        System.out.println("Xoay 360");
    }

    void PlaySound()
    {
      
        System.out.println("Play soundFile: "+ this.soundFile);
    }
}
