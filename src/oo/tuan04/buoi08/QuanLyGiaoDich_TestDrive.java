package oo.tuan04.buoi08;

import java.util.Date;

public class QuanLyGiaoDich_TestDrive 
{
    public static void main(String[] args) 
    {
        /*QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich(200811, new Date(03, 01, 2014), 8, 3);
        System.out.println(quanLyGiaoDich.toString());
        System.out.println(quanLyGiaoDich.thanh_Tien());

        GiaoDichVang giaoDichVang = new GiaoDichVang(2008, new Date(02, 05, 2021), 23000, 5, "3999");
        System.out.println(giaoDichVang.toString());*/

        GiaoDichVang giaoDichVang2 = new GiaoDichVang();
        giaoDichVang2.Nhap_Thong_Tin();
        System.out.println(giaoDichVang2.toString());
    }    
}
