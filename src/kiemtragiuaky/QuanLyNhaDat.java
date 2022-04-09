package kiemtragiuaky;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

abstract public class QuanLyNhaDat 
{
    protected Scanner scanner = new Scanner(System.in);
    protected String ma_Gia_Dich;
    protected Date date_Giao_Dich;    
    protected double don_Gia;
    protected double thanh_Tien;
    protected double dien_Tich;

    public void setDien_Tich(double dien_Tich) 
    {
        this.dien_Tich = dien_Tich;
    }

    public double getDien_Tich() 
    {
        return dien_Tich;
    }

    public void setMa_Gia_Dich(String ma_Gia_Dich) 
    {
        this.ma_Gia_Dich = ma_Gia_Dich;
    }

    public String getMa_Gia_Dich() 
    {
        return ma_Gia_Dich;
    }

    public void setDate_Giao_Dich(Date date_Giao_Dich) 
    {
        this.date_Giao_Dich = date_Giao_Dich;
    }

    public Date getDate_Giao_Dich() 
    {
        return date_Giao_Dich;
    }

    public void setDon_Gia(double don_Gia) 
    {
        this.don_Gia = don_Gia;
    }

    public double getDon_Gia() 
    {
        return don_Gia;
    }

    public void setThanh_Tien(double thanh_Tien) 
    {
        this.thanh_Tien = thanh_Tien;
    }

    public double getThanh_Tien() 
    {
        return thanh_Tien;
    }

    public QuanLyNhaDat()
    {

    }

    public QuanLyNhaDat(String ma_Giao_Dich, Date date_Giao_Dich, double don_Gia,  double dien_Tich)
    {
        this.setMa_Gia_Dich(ma_Gia_Dich);
        this.setDate_Giao_Dich(date_Giao_Dich);
        this.setDon_Gia(don_Gia);
        this.setDien_Tich(dien_Tich);
    }

    public void Nhap_Thong_Tin()
    {
        System.out.println("Ma Giao Dich: ");
        this.ma_Gia_Dich = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ngay Giao Dich: He Thong Tu Cap Nhat Ngay Tren Thiet Bi Cua Ban ( Khong Can Nhap ) ");
        this.date_Giao_Dich = new Date();
        System.out.println("Don Gia: ");
        this.don_Gia = scanner.nextDouble();
        System.out.println("Dien Tich: ");
        this.dien_Tich = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public String toString() 
    {
        SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");
        Locale locale = new Locale("vi", "VN");
        return " Ma Giao Dich: " + this.getMa_Gia_Dich() + " / " + " Ngay Giao Dich: " + ngayVN.format(date_Giao_Dich)
        + " / " + " Don Gia: " + this.getDon_Gia() + " / " + " Dien Tich: " + this.getDien_Tich() + " / ";    
    }




}
