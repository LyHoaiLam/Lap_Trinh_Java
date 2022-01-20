package baitapvenha;

public class HinhTron 
{
    String soundFile = "hinhTron.afl";
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
      
        System.out.println("play soundFile: "+ this.soundFile);
    }
}
