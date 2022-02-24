package oo.sanpham01;

public class SanPham01_TestDrive 
{
    public static void main(String[] args) 
    {
        SanPham01 sanPham01 = new SanPham01();
        sanPham01.nhap();
        sanPham01.xuat();
        System.out.println("Thue nhap khau la: "+ sanPham01.getThueNhapKhau(0.5));    
    }    
}
