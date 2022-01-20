package baitapvenha;

public class Amoeba 
{
    String soundFile;

    Amoeba()
    {
        
    }

    public Amoeba(String soundFile)
    {
        this.soundFile = soundFile;
    }    

    void xoayHinhAmoeba()
    {
        System.out.println("Xoay 360");
    }

    void phatAmThanhAmoeba()
    {
        System.out.println("play SoundFile:: "+ this.soundFile);
    }
}
