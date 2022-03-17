package oo.tuan04.buoi08;

import java.util.Date;


public class GiaoDichVang extends QuanLyGiaoDich
{
    private double thanh_Tien;
    private String loai_Vang;


    public void set_Thanh_Tien(double thanh_Tien)
    {
        this.thanh_Tien = thanh_Tien;
    }

    public double get_Thanh_Tien()
    {
        return this.thanh_Tien;
    }

    public void set_Loai_Vang(String loai_Vang) 
    {
        this.loai_Vang = loai_Vang;
    }

    public String get_Loai_Vang() 
    {
        return loai_Vang;
    }

    public GiaoDichVang()
    {

    }

    public GiaoDichVang(int ma_Giao_Dich, Date date_Giao_Dich, double don_Gia, double so_Luong, String loai_Vang)
    {
        super(ma_Giao_Dich, date_Giao_Dich, don_Gia, so_Luong);
        this.loai_Vang = loai_Vang;
    }

    public GiaoDichVang(double thanh_Tien)
    {
        this.thanh_Tien = thanh_Tien;
    }


    public double Tinh_Tien()
    {
        this.thanh_Tien = super.so_Luong * super.don_Gia;
        return this.thanh_Tien;
    }

    @Override
    public void Nhap_Thong_Tin() {
        super.Nhap_Thong_Tin();
        scanner.nextLine();
        System.out.println("Loai Vang: ");
        this.loai_Vang = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " LOAI VANG: " + this.loai_Vang + " / " + " THANH TIEN: " + this.Tinh_Tien();
    }

}
