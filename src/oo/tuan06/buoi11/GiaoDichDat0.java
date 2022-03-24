package oo.tuan06.buoi11;

import java.util.Date;

public class GiaoDichDat0 extends GiaoDich
{
    private char loai_Dat;// A, B, C
    public void setLoai_Dat(char loai_Dat) 
    {
        this.loai_Dat = loai_Dat;
    }

    public char getLoai_Dat() 
    {
        return loai_Dat;
    }
    

    GiaoDichDat0()
    {

    }

    GiaoDichDat0(String ma_Giao_Dich, Date ngay_Giao_Dich, double don_Gia, double dien_Tich,char loai_Dat)
    {
        super(ma_Giao_Dich, ngay_Giao_Dich, don_Gia, dien_Tich);
        this.loai_Dat = loai_Dat;
    }

    @Override
    public double Tinh_Tien() {
        double tien;

         if(this.loai_Dat == 'C' && this.loai_Dat == 'B')
         {
             tien = super.getDien_Tich() * super.getDon_Gia();
         }
         else
         {
             tien = super.getDien_Tich() * super.getDon_Gia() * 1.5;
         }
        return tien;
    }


   

    @Override
    public String toString() 
    {
        
        return super.toString() + " Loai Dat: " + this.loai_Dat;
    }


}
