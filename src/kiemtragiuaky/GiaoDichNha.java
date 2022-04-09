package kiemtragiuaky;

import java.util.Date;

public class GiaoDichNha extends QuanLyNhaDat
{
    private String loai_Nha;

    public void setLoai_Nha(String loai_Nha) 
    {
        this.loai_Nha = loai_Nha;
    }

    public String getLoai_Nha() 
    {
        return loai_Nha;
    }

    public GiaoDichNha()
    {

    }

    public GiaoDichNha(String ma_Giao_Dich, Date date_Giao_Dich, double don_Gia, double dien_Tich,String loai_Nha)
    {
        super(ma_Giao_Dich, date_Giao_Dich, don_Gia, dien_Tich);
        this.setLoai_Nha(loai_Nha);
    }

    double tinh_Tien_Gia_Nha()
    {
        /*if(this.loai_Nha == "cao cap")
        {
            super.thanh_Tien = super.dien_Tich * super.don_Gia;
        }

        if(this.loai_Nha == "thuong")
        {
            double tong;
            super.thanh_Tien = super.dien_Tich * super.don_Gia;
            tong = super.dien_Tich * super.don_Gia / 100 * 90;
            super.thanh_Tien = tong;
        }*/

        super.thanh_Tien = super.don_Gia * super.dien_Tich;

        return super.thanh_Tien;
    }



    @Override
    public void Nhap_Thong_Tin() 
    {
        super.Nhap_Thong_Tin();
        System.out.println("Loai Nha: ( cao cap / thuong ) ");
        this.loai_Nha = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " Loai Nha: " + this.loai_Nha + " Thanh Tien: " + this.tinh_Tien_Gia_Nha() ;
    }
}
