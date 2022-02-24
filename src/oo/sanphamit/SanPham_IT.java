package oo.sanphamit;

import java.util.Scanner;

public class SanPham_IT 
{
    String nameSanPhamIT;
    double giabanSanPhamIT;
    int namSanXuat;
    Scanner input = new Scanner(System.in);
    
    void nhap()
    {
        System.out.println("Ten San Pham: ");
        nameSanPhamIT = input.nextLine();
        System.out.println("Gia Ban: ");
        giabanSanPhamIT = input.nextDouble();
        System.out.println("Nam Xuat Ban:");
        namSanXuat = input.nextInt();
    }

    void xuat()
    {
        System.out.println("Ten: "+ this.nameSanPhamIT);
        System.out.println("Gia Ban: "+ this.giabanSanPhamIT);
        System.out.println("Nam San Xuat: "+ this.namSanXuat);
    }
}
