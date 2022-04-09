package oo.tuan06.buoi11;

import java.util.Date;

public abstract class GiaoDich 
{
    public String ma_Giao_Dich;
    private Date ngay_Giao_Dich;
    private double don_Gia;
    private double dien_Tich;
    private static int count;// Đếm xem hàm tạo được tạo bao nhiêu lần ( tạo bao nhiêu danh sách có bấy nhiêu giao dịch )

    public void setMa_Giao_Dich(String ma_Giao_Dich) 
    {
        this.ma_Giao_Dich = ma_Giao_Dich;
    }

    public String getMa_Giao_Dich() 
    {
        return ma_Giao_Dich;
    }

    public void setNgay_Giao_Dich(Date ngay_Giao_Dich) 
    {
        this.ngay_Giao_Dich = ngay_Giao_Dich;
    }

    public Date getNgay_Giao_Dich() 
    {
        return ngay_Giao_Dich;
    }

    public void setDien_Tich(double dien_Tich) 
    {
        this.dien_Tich = dien_Tich;
    }

    public double getDien_Tich() 
    {
        return dien_Tich;
    }

    public void setDon_Gia(double don_Gia) 
    {
        this.don_Gia = don_Gia;
    }

    public double getDon_Gia() 
    {
        return don_Gia;
    }

    private void tang_Count()
    {
        count++;
    }
    public GiaoDich()
    {
        this.tang_Count();
    }

    public GiaoDich(String ma_Giao_Dich, Date ngay_Giao_Dich, double don_Gia, double dien_Tich)
    {
        this.ma_Giao_Dich = ma_Giao_Dich;
        this.ngay_Giao_Dich = ngay_Giao_Dich;
        this.don_Gia = don_Gia;
        this.dien_Tich = dien_Tich;
    }


    public abstract double Tinh_Tien();

    @Override
    public String toString() 
    {
        return " Ma Giao Dich: " + this.ma_Giao_Dich + " / " + " Ngay Giao Dich: " + " / " + this.ngay_Giao_Dich + " / " + " Don Gia: " + this.don_Gia + " / " + " Dien Tich: " + this.dien_Tich + " / ";
    }

}
