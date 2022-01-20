package baitapvenha;

public class HinhTamGiac 
{
    String soundFile = "hinhTamGiac.afl";
    HinhTamGiac()
    {

    }   

   

    public HinhTamGiac(String soundFile)
    {
        this.soundFile = soundFile;
    }
    
    void xoayHinhTamGiac()
    {
        System.out.println("Xoay 360 ");
    }

    void phatAmThanhHinhTamGiac()
    {
        System.out.println("play soundFile: "+ this.soundFile);
    }
}
