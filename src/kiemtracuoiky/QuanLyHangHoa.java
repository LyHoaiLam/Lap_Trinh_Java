package kiemtracuoiky;

import java.io.Serializable;

public abstract class QuanLyHangHoa implements Serializable
{
    private String ma_Hang_Hoa;
    protected String  ten_Hang_Hoa;
    protected int so_Luong_Ton; // >= 0
    protected double don_Gia; // > 0
    protected double thue_VAT;

    public QuanLyHangHoa()
    {

    }

    public QuanLyHangHoa(String ma_Hang_Hoa, String ten_Hang_Hoa, int so_Luong_Ton, double don_Gia, double thue_VAT)
    {
        this.ma_Hang_Hoa = ma_Hang_Hoa;
        this.ten_Hang_Hoa = ten_Hang_Hoa;
        this.so_Luong_Ton = so_Luong_Ton;
        this.don_Gia = don_Gia;
        this.thue_VAT = thue_VAT;
    }

    private void setMa_Hang_Hoa(String ma_Hang_Hoa) 
    {
        this.ma_Hang_Hoa = ma_Hang_Hoa;
    }

    public String getMa_Hang_Hoa() 
    {
        return ma_Hang_Hoa;
    }

    public void setTen_Hang_Hoa(String ten_Hang_Hoa) 
    {
        this.ten_Hang_Hoa = ten_Hang_Hoa;
    }

    public String getTen_Hang_Hoa() 
    {
        return ten_Hang_Hoa;   
    }

    public void setSo_Luong_Ton(int so_Luong_Ton) 
    {
        this.so_Luong_Ton = so_Luong_Ton;
    }

    public int getSo_Luong_Ton() 
    {
        return so_Luong_Ton;
    }

    public void setDon_Gia(double don_Gia) 
    {
        this.don_Gia = don_Gia;
    }

    public double getDon_Gia() {
        return don_Gia;
    }

    public void setThue_VAT(double thue_VAT) 
    {
        this.thue_VAT = thue_VAT;
    }

    public double getThue_VAT() 
    {
        return thue_VAT;
        // VAT SanhSu = 10%
        // VAT ThucPham = 5%
        // VAT DienMay = 10%
    }

}
