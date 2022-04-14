package onlaibaihoc;

public class HinhChuNhat_OnTap 
{
    private double chieu_Dai;
    private double chieu_Rong;
    
    public void setChieu_Dai(double chieu_Dai) 
    {
        this.chieu_Dai = chieu_Dai;
    }

    public double getChieu_Dai() 
    {
        return chieu_Dai;
    }

    public void setChieu_Rong(double chieu_Rong) 
    {
        this.chieu_Rong = chieu_Rong;
    }

    public double getChieu_Rong() 
    {
        return chieu_Rong;
    }

    public double tinh_Dien_Tich()
    {
        return this.getChieu_Dai() * this.getChieu_Rong();   
    }

    public double tinh_Chu_Vi()
    {
        return ( this.getChieu_Dai() * this.getChieu_Rong() ) * 2;
    }

    @Override
    public String toString() 
    {
        return " Chieu Dai: " + this.getChieu_Dai() + " / " + " Chieu Rong: " + 
        this.getChieu_Rong() + " / " + " Chu Vi: " + this.tinh_Chu_Vi() + " / " + " Dien Tich: " + this.tinh_Dien_Tich();
     
    }
}
