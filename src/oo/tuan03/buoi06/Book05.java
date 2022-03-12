package oo.tuan03.buoi06;

import java.util.Scanner;

public class Book05 
{
    private String date;
    private int maSach;
    private String nhaXuatBan;
    protected int soLuong;
    protected double donGia;
    private double thanhTien;

    protected Scanner input = new Scanner(System.in);

    public void setMaSach(int maSach) 
    {
        this.maSach = maSach;
    }
    
    public int getMaSach() 
    {
        return maSach;
    }

    public void setNhaXuatBan(String nhaXuatBan) 
    {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getNhaXuatBan() 
    {
        return nhaXuatBan;
    }

    public void setSoLuong(int soLuong)  
    {
        this.soLuong = soLuong;
    }

    public int getSoLuong() 
    {
        return soLuong;
    }

    public void setDonGia(double donGia) 
    {
        this.donGia = donGia;
    }

    public double getDonGia() 
    {
        return donGia;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getDate()  
    {
        return date;
    }

    public void setThanhTien(double thanhTien) 
    {
        this.thanhTien = thanhTien;
    }

    public double getThanhTien() 
    {
        return thanhTien;
    }


    public Book05()
    {

    }

    public Book05(int maSach, String nhaXuatBan, int soLuong, double donGia, String date)
    {
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.date = date;
    }

    public void Enter_Book_Information()
    {
        System.out.println("Ma Sach: ");
        this.maSach = input.nextInt();
        input.nextLine();
        System.err.println("Nha Xuat Ban: ");
        this.nhaXuatBan = input.nextLine();
        System.out.println("So Luong: ");
        this.soLuong = input.nextInt();
        System.out.println("Don Gia: ");
        this.donGia = input.nextDouble();
        input.nextLine();
        System.out.println("Ngay Nhap");
        this.date = input.nextLine();

    }

    
    public String toString() 
    {
        return " MA SACH: " + this.maSach + " / " + " NHA XUAT BAN: " +this.nhaXuatBan + "/ " + " SO LUONG: " + this.soLuong +
         " / " + " DON GIA: " + this.donGia + " / " + " NGAY NHAP: " + this.date; 
    }


}
