package baitapvenha;

public class HinhChuNhat 
{
    String soundFile = "hinhChuNhat.afl";


    HinhChuNhat()
    {

    }
    // method
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
