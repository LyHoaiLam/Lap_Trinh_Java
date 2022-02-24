package oo.hinhchunhat;


public class HinhChuNhat 
{
    private double chieuDai;
    private double chieuRong;

    public double getChieuRong()
    {
        return this.chieuRong;
    }

    public double getChieuDai()
    {
        return this.chieuDai;
    }

    public void setChieuDai(double dai)
    {
        this.chieuDai = dai;
    }

    public void setChieuRong(double rong)
    {
        this.chieuRong = rong;
    }

    public double dienTich()
    {
        return this.chieuDai * this.chieuRong;
    }

    public double chuVi()
    {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public String toString()
    {
        String string = "Chieu Dai: "+ this.chieuDai +" "+ "Chieu Rong: " + this.chieuRong;
        string += "Chu Vi: "+ this.chuVi() + "Dien Tich: "+ this.dienTich(); 
        return string;
    }


    
}
