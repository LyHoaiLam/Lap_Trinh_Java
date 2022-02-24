package oo.sanpham01;

import java.util.Scanner;


public class SanPham01 
{
    String nameSanPham;
    double giaSanPham;
    double giamGiaSabPham;
    
    Scanner input = new Scanner(System.in);

    void nhap()
    {
        System.out.println("Ten San Pham");
        nameSanPham = input.nextLine();
        System.out.println("Don Gia");
        giaSanPham = input.nextDouble();
        System.out.println("Giam Gia");
        giamGiaSabPham = input.nextDouble();
    }

    void xuat()
    {
        System.out.println("Ten: "+ this.nameSanPham);
        System.out.println("Don Gia: "+ this.giaSanPham);
        System.out.println("Giam Gia: "+ this.giamGiaSabPham);
    }

    double getThueNhapKhau(double giaThue)
    {
        return giaThue;
    }
}
