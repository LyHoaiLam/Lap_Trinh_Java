package kiemtracuoiky;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThucPham extends QuanLyHangHoa implements Serializable
{
    public Date ngay_San_Xuat;
    public Date ngay_Het_Han;
    public String nha_Cung_Cap;

    public void setNha_Cung_Cap(String nha_Cung_Cap) 
    {
        this.nha_Cung_Cap = nha_Cung_Cap;
    }

    public String getNha_Cung_Cap() 
    {
        return nha_Cung_Cap;
    }

    public void setNgay_San_Xuat(Date ngay_San_Xuat) 
    {
        this.ngay_San_Xuat = ngay_San_Xuat;
    }

    public Date getNgay_San_Xuat() 
    {
        return ngay_San_Xuat;
    }

    public void setNgay_Het_Han(Date ngay_Het_Han) 
    {
        this.ngay_Het_Han = ngay_Het_Han;
    }

    public Date getNgay_Het_Han() 
    {
        return ngay_Het_Han;
    }

    
    public ThucPham()
    {
        
    }

    public ThucPham(String ma_Hang_Hoa, String ten_Hang_Hoa, int so_Luong_Ton, double don_Gia
    , String nha_Cung_Cap, Date ngay_San_Xuat, Date ngay_Het_Han)
    {
        super(ma_Hang_Hoa, ten_Hang_Hoa, so_Luong_Ton, don_Gia);
        this.setNha_Cung_Cap(nha_Cung_Cap);
        this.setNgay_San_Xuat(ngay_San_Xuat);
        this.setNgay_Het_Han(ngay_Het_Han);
    }

    @Override
    public String toString()
    {
        super.setThue_VAT(0.05);
        return super.toString() + " Nha Cung Cap: " + this.getNha_Cung_Cap() + "/" 
         + " Ngay San Xuat: " + this.getNgay_San_Xuat() + "/" + " Ngay Het Han: " + this.getNgay_Het_Han() + " Thue VAT: " + super.getThue_VAT();
    }

   
    

}
