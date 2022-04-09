package kiemtragiuaky;

import java.util.Date;

public class GiaoDichDat extends QuanLyNhaDat
{
    protected char loai_Dat;
    protected double dien_Tich;
    

    public void setLoai_Dat(char loai_Dat) 
    {
        this.loai_Dat = loai_Dat;
    }

    public char getLoai_Dat() 
    {
        return loai_Dat;
    }

    public void setDien_Tich(double dien_Tich) 
    {
        this.dien_Tich = dien_Tich;
    }

    public double getDien_Tich() 
    {
        return dien_Tich;
    }

    public GiaoDichDat()
    {

    }

    public GiaoDichDat(String ma_Giao_Dich, Date date, double don_Gia, double dien_Tich, char loai_Dat)
    {
        super(ma_Giao_Dich, date, don_Gia, dien_Tich);
        this.setLoai_Dat(loai_Dat);
    }

    public double tinh_Tien_Gia_Dat()
    {
        if(this.loai_Dat == 'B')
        {
            super.thanh_Tien = super.dien_Tich * this.don_Gia;
        }

        if(this.loai_Dat == 'C')
        {
            super.thanh_Tien = super.dien_Tich * this.don_Gia;
        }
        
        if(this.loai_Dat == 'A')
        {
            super.thanh_Tien = super.dien_Tich * this.don_Gia * 1.5;
        }
        super.thanh_Tien = super.dien_Tich * super.don_Gia;
        return super.thanh_Tien;
    }

    @Override
    public void Nhap_Thong_Tin() {
        super.Nhap_Thong_Tin();
        System.out.println("Loai Dat: ( A / B / C / Viet In Hoa) ");
        this.loai_Dat = scanner.nextLine().charAt(loai_Dat);
      
    }

    @Override
    public String toString() 
    {
        return super.toString() + " Loai Dat: " + this.getLoai_Dat() + " / " + " Tong Tien: " + this.tinh_Tien_Gia_Dat();
    }

   


}
