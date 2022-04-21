package kiemtracuoiky;

import java.io.Serializable;
import java.util.Date;

public class SanhSu extends QuanLyHangHoa implements Serializable
{
    public Date ngay_San_Xuat;
    public Date ngay_Nhap_Kho;

    public void setNgay_San_Xuat(Date ngay_San_Xuat) 
    {
        this.ngay_San_Xuat = ngay_San_Xuat;
    }

    public Date getNgay_San_Xuat() 
    {
        return ngay_San_Xuat;
    }

    public void setNgay_Nhap_Kho(Date ngay_Nhap_Kho) 
    {
        this.ngay_Nhap_Kho = ngay_Nhap_Kho;
    }

    public Date getNgay_Nhap_Kho() 
    {
        return ngay_Nhap_Kho;
    }


    public SanhSu()
    {
        
    }

    public SanhSu(String ma_Hang_Hoa, String ten_Hang_Hoa, int so_Luong_Ton, double don_Gia, Date ngay_San_Xuat, Date ngay_Nhap_Kho)
    {
        super(ma_Hang_Hoa, ten_Hang_Hoa, so_Luong_Ton, don_Gia);
        this.setNgay_San_Xuat(ngay_San_Xuat);
        this.setNgay_Nhap_Kho(ngay_Nhap_Kho);
    }




    
    @Override
    public String toString() 
    {
        super.setThue_VAT(0.1);
        return super.toString() + " Ngay San Xuat: " + this.getNgay_San_Xuat() + "/" +
         " Ngay Nhap Kho: " + this.getNgay_Nhap_Kho() + " Thue VAT: " + super.getThue_VAT();
    }

}
