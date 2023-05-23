package oo.buoi08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class QuanLyGiaoDich 
{
    protected int ma_Giao_Dich;
    protected Date date_Giao_Dich;
    protected double don_Gia;
    protected double so_Luong;
    private String ngay_Giao_D;
    protected Scanner scanner = new Scanner(System.in);

    public void set_Date_Giao_Dich(Date date_Giao_Dich) 
    {
        this.date_Giao_Dich = date_Giao_Dich;
    }

    public Date get_Date_Giao_Dich() 
    {
        return date_Giao_Dich;
    }

    public QuanLyGiaoDich()
    {

    }

    public QuanLyGiaoDich(int ma_Giao_Dich, Date date_Giao_Dich, double don_Gia, double so_Luong)
    {
        this.ma_Giao_Dich = ma_Giao_Dich;
        this.date_Giao_Dich = date_Giao_Dich;
        this.don_Gia = don_Gia;
        this.so_Luong = so_Luong;
    }

    public void Nhap_Thong_Tin()
    {
        System.out.println("Ma Giao Dich: ");
        this.ma_Giao_Dich = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ngay Giao Dich: ");
        this.ngay_Giao_D = scanner.nextLine();

        System.out.println("Don Gia: ");
        this.don_Gia = scanner.nextDouble();
        System.out.println("So Luong: ");
        this.so_Luong = scanner.nextDouble();
        scanner.nextLine();
    }

    public double thanh_Tien()
    {
        return this.so_Luong * this.don_Gia;
    }

    @Override
    public String toString() 
    {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        Locale locale = new Locale("vi", "vn");
        return " MA GIAO DICH: " + this.ma_Giao_Dich + " / " + " / " + " DON GIA: " + this.don_Gia
        + " / " + " SO LUONG: " + this.so_Luong + " / " + " Date Giao Dich: " + ngayVietNam.format(date_Giao_Dich) ;    
    }

}
