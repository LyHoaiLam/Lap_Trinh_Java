package oo.tuan06.buoi11;

import java.util.Date;

public class GiaoDich_TestDrive 
{
    public static void main(String[] args) 
    {
        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();

        //GiaoDichDat0 giaoDichDat0 = new GiaoDichDat0("GD01", new Date(), 13000, 5, 'B');
        //GiaoDichDat0 giaoDichDat02 = new GiaoDichDat0("GD02", new Date(), 10000, 2.2, 'A');
        
        GiaoDichNha0 giaoDichNha0 = new GiaoDichNha0("GD03", new Date(), 22000, 6, "CaoCap", "Quan 1");
        GiaoDichNha0 giaoDichNha02 = new GiaoDichNha0("GD004", new Date(), 12000, 2.3, "Binh Thuong", "Quan Tan Binh");
        //danhSachGiaoDich.Add_Giao_Dich(giaoDichDat0);
        //danhSachGiaoDich.Add_Giao_Dich(giaoDichDat02);
        danhSachGiaoDich.Add_Giao_Dich(giaoDichNha02);
        danhSachGiaoDich.Add_Giao_Dich(giaoDichNha0);
        System.out.println("----------------------------------------------");
        danhSachGiaoDich.print_Information_Giao_Dich();
        System.out.println("***********************************************");
        System.out.println(giaoDichNha0);
        System.out.println(giaoDichNha0.Tinh_Tien());
        System.out.println("***********************************************");
        System.out.println(giaoDichNha02);
        System.out.println(giaoDichNha02.Tinh_Tien());
        System.out.println("***********************************************");
        //danhSachGiaoDich.Tinh_Tong_So_Luong_Tung_Loai();

        //System.out.println("Dat: " + danhSachGiaoDich.getSo_Luong_Giao_Dich_Dat());
        //System.out.println("Tong Giao Dich Dat: " + danhSachGiaoDich.Tinh_Tong_TB_Giao_Dich_Dat());

        //System.out.println(giaoDichDat0.Tinh_Tien());
        //System.out.println(giaoDichDat02.Tinh_Tien());
    }    
}
