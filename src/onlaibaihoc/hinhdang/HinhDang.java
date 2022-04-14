package onlaibaihoc.hinhdang;

public class HinhDang 
{
    private String sound_File;
    
    public void setSound_File(String sound_File) 
    {
        this.sound_File = sound_File;
    }

    public String getDound_File() 
    {
        return sound_File;
    }

    public HinhDang()
    {

    }

    public HinhDang(String sound_File)
    {
        this.setSound_File(sound_File);
    }

    public void Rotate()
    {
        System.out.println("Rotating 360");
        this.PlaySound();
    }

    public void PlaySound()
    {
        System.out.println(this.sound_File + " MuSic");
    }


}
