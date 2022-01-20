package baitapvenha;

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
     
    void xoayHinhTron()
    {
       
        System.out.println("Xoay 360");
    }

    void phatAmThanhHinhTron()
    {
      
        System.out.println("Play soundFile: "+ this.soundFile);
    }
}
