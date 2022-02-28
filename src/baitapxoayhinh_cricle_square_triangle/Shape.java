package baitapxoayhinh_cricle_square_triangle;

public class Shape // Hình dạng
{
    private String soundFile;
    //Override Ghi đè ( Cài đè ) 
    Shape()
    {

    }   

    public Shape(String soundFile)
    {
        this.soundFile = soundFile;
    }

    public void setSoundFile(String soundFile)
    {
        this.soundFile = soundFile;
    }

    public String getSoundFile()
    {
        return this.soundFile;
    }
     
    public void Rotate()
    {
       
        System.out.println("Xoay 360");
        this.PlaySound();
    }

    public void PlaySound()
    {
      
        System.out.println("Play soundFile: "+ this.soundFile);
    }    

}
