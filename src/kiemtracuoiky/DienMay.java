package kiemtracuoiky;

import java.io.Serializable;
import java.util.Date;

public class DienMay extends QuanLyHangHoa implements Serializable
{
    public int thoi_Gian_Bao_Hanh;
    public double cong_Xuat_KW;

    public void setCong_Xuat_KW(double cong_Xuat_KW) 
    {
        this.cong_Xuat_KW = cong_Xuat_KW;
    }

    public double getCong_Xuat_KW() 
    {
        return cong_Xuat_KW;
    }

    public void setThoi_Gian_Bao_Hanh(int thoi_Gian_Bao_Hanh) 
    {
        this.thoi_Gian_Bao_Hanh = thoi_Gian_Bao_Hanh;
    }

    public int getThoi_Gian_Bao_Hanh() 
    {
        return thoi_Gian_Bao_Hanh;
    }

    public DienMay()
    {
        
    }

    public DienMay(String ma_Hang_Hoa, String ten_Hang_Hoa, int so_Luong_Ton, double don_Gia, double cong_Xuat_KW, int thoi_Gian_Bao_Hanh)
    {
        super(ma_Hang_Hoa, ten_Hang_Hoa, so_Luong_Ton, don_Gia);
        this.setCong_Xuat_KW(cong_Xuat_KW);
        this.setThoi_Gian_Bao_Hanh(thoi_Gian_Bao_Hanh);

    }

    @Override
    public String toString() 
    {
        super.setThue_VAT(0.1);
        return super.toString() + " Cong Xuat KW: " + this.getCong_Xuat_KW() +
         "/" + " Thoi Gian Bao Hanh: " + this.getThoi_Gian_Bao_Hanh() + " Thang" + " Thue VAT: " + super.getThue_VAT(); 
    }

}
