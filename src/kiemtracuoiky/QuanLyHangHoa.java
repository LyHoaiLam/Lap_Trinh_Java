package kiemtracuoiky;

public abstract class QuanLyHangHoa 
{
    String ma_Hang_Hoa;
    String  ten_Hang_Hoa;
    int so_Luong_Ton; // >= 0
    double don_Gia; // > 0
    double thue_VAT;

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
