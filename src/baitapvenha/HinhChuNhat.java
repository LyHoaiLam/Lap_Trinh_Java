package baitapvenha;

public class HinhChuNhat 
{
    // Attribute
    String soundFile;;

    // Method
    HinhChuNhat()
    {

    }

    public HinhChuNhat(String soundFile)
    {
        this.soundFile = soundFile;
    }

    void xoayHinhChuNhat()
    {
        System.out.println("Xoay 360 ");
    }

    void phatAmThanhNhacHinhChuNhat()
    {
        System.out.println("Play soundFile: " + this.soundFile);
    }

}
