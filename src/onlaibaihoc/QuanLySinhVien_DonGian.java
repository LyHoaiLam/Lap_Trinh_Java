package onlaibaihoc;

public class QuanLySinhVien_DonGian 
{
    private int ma_So_Sinh_Vien;
    private String ho_Va_Ten;
    private double diem_Ly_Thuyet;
    private double diem_Thuc_Hanh;  
    
    public void setMa_So_Sinh_Vien(int ma_So_Sinh_Vien) 
    {
        this.ma_So_Sinh_Vien = ma_So_Sinh_Vien;
    }

    public int getMa_So_Sinh_Vien() 
    {
        return ma_So_Sinh_Vien;
    }

    public void setHo_Va_Ten(String ho_Va_Ten) 
    {
        this.ho_Va_Ten = ho_Va_Ten;
    }

    public String getHo_Va_Ten() 
    {
        return ho_Va_Ten;
    }

    public void setDiem_Ly_Thuyet(double diem_Ly_Thuyet) 
    {
        this.diem_Ly_Thuyet = diem_Ly_Thuyet;
    }

    public double getDiem_Ly_Thuyet() 
    {
        return diem_Ly_Thuyet;
    }

    public void setDiem_Thuc_Hanh(double diem_Thuc_Hanh) 
    {
        this.diem_Thuc_Hanh = diem_Thuc_Hanh;
    }

    public double getDiem_Thuc_Hanh() 
    {
        return diem_Thuc_Hanh;
    }

    QuanLySinhVien_DonGian()
    {

    }

    QuanLySinhVien_DonGian(int ma_So_Sinh_Vien, String ho_Va_Ten, double diem_Ly_Thuyet, double diem_Thuc_Hanh)
    {
        this.ma_So_Sinh_Vien = ma_So_Sinh_Vien;
        this.ho_Va_Ten = ho_Va_Ten;
        this.diem_Ly_Thuyet = diem_Ly_Thuyet;
        this.diem_Thuc_Hanh = diem_Thuc_Hanh;
    }

    public double tinh_Diem_Trung_Binh()
    {
        return ( this.getDiem_Ly_Thuyet() + this.getDiem_Thuc_Hanh() ) / 2;
    }

    @Override
    public String toString() {
        return " MSSV: " + this.ma_So_Sinh_Vien + " / " + " Ho Va Ten: " + this.ho_Va_Ten + " / " 
        + " Ly Thuyet: " + this.diem_Ly_Thuyet + " / " + " Thuc Hanh: "+ this.diem_Thuc_Hanh + " / "
        + " Diem Trung Binh: " + this.tinh_Diem_Trung_Binh();
    }
}
