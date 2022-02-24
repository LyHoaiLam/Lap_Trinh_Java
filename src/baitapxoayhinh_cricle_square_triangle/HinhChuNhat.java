package baitapxoayhinh_cricle_square_triangle;

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

    void Rotate()
    {
        System.out.println("Xoay 360 ");
    }

    void PlaySound()
    {
        System.out.println("Play soundFile: " + this.soundFile);
    }

}
