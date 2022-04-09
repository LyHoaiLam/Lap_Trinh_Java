package oo.tuan06.buoi11;

import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich 
{
    private List<GiaoDich> danh_Sach_Giao_Dich = new ArrayList<>();
    private int so_Luong_Giao_Dich_Dat;
    private int so_Luong_Giao_Dich_Nha;

    public void setSo_Luong_Giao_Dich_Dat(int so_Luong_Giao_Dich_Dat) 
    {
        this.so_Luong_Giao_Dich_Dat = so_Luong_Giao_Dich_Dat;
    }

    public int getSo_Luong_Giao_Dich_Dat() 
    {
        return so_Luong_Giao_Dich_Dat;
    }

    public void setSo_Luong_Giao_Dich_Nha(int so_Luong_Giao_Dich_Nha) 
    {
        this.so_Luong_Giao_Dich_Nha = so_Luong_Giao_Dich_Nha;
    }

    public int getSo_Luong_Giao_Dich_Nha() 
    {
        return so_Luong_Giao_Dich_Nha;
    }

    public void Add_Giao_Dich(GiaoDich giaoDich)
    {
        danh_Sach_Giao_Dich.add(giaoDich);
    }

    public void print_Information_Giao_Dich()
    {
        for (GiaoDich giaoDich_111 : danh_Sach_Giao_Dich) 
        {
            System.out.println(giaoDich_111);
        }
    }


    public void Tinh_Tong_So_Luong_Tung_Loai()
    {
        for (GiaoDich giaoDich_666 : danh_Sach_Giao_Dich) 
        {
            if(giaoDich_666 instanceof GiaoDichDat0)
            {
                this.so_Luong_Giao_Dich_Dat++;
            }  
            else
            {
                this.so_Luong_Giao_Dich_Nha++;
            } 
        }
    }


    public double Tinh_Tong_TB_Giao_Dich_Dat()
    {
        double tien_Giao_Dich_Dat = 0;
        int dem = 0;
        for (GiaoDich giaoDich256 : danh_Sach_Giao_Dich) 
        {
            if(giaoDich256 instanceof GiaoDichDat0)
            {
                dem++;
                tien_Giao_Dich_Dat += giaoDich256.Tinh_Tien();
            }
        }
        return tien_Giao_Dich_Dat / dem;
    }

   

    public void Xoa_Giao_Dich(GiaoDich giaoDich)
    {
        this.danh_Sach_Giao_Dich.remove(giaoDich);
    }




}
