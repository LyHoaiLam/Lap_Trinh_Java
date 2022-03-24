package oo.tuan06.buoi11;

import java.util.Date;

public class GiaoDichNha0 extends GiaoDich
{
    

    private String loai_Nha;
    private String dia_Chi;

    public void setLoai_Nha(String loai_Nha) 
    {
        this.loai_Nha = loai_Nha;
    }

    public String getLoai_Nha() 
    {
        return loai_Nha;
    }

    public void setDia_Chi(String dia_Chi) 
    {
        this.dia_Chi = dia_Chi;
    }

    public String getDia_Chi() 
    {
        return dia_Chi;
    }

    GiaoDichNha0()
    {

    }

    GiaoDichNha0(String ma_Giao_Dich, Date ngay_Giao_Dich, double don_Gia, double dien_Tich,String loai_Nha, String dia_Chi)
    {
        super(ma_Giao_Dich, ngay_Giao_Dich, don_Gia, dien_Tich);
        this.loai_Nha = loai_Nha;
        this.dia_Chi = dia_Chi;
    }


    @Override
    public double Tinh_Tien() 
    {
        double tien;
        if(this.loai_Nha.equals("CaoCap"))
        {
            tien = super.getDien_Tich() * super.getDon_Gia();
        }
        else
        {
            tien = super.getDien_Tich() * super.getDon_Gia() * 0.9;
        }
        return tien;
    }

    @Override
    public String toString() {
        return super.toString() + " Loai Nha: " + this.loai_Nha + " / " + " Dia Chi: " + this.dia_Chi;
    }
}
