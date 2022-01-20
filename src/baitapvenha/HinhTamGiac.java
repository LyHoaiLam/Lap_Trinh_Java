package baitapvenha;

public class HinhTamGiac 
{
    // Attribute
    String soundFile;;
    
    // Method
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
        System.out.println("Play soundFile: "+ this.soundFile);
    }
}
