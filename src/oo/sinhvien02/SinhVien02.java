package oo.sinhvien02;
import java.util.Scanner;

import java.util.Scanner;

public class SinhVien02 
{
    private int mssv;
    private String name;
    private double diemlt;
    private double diemth;

    SinhVien02()
    {

    }

    SinhVien02(int mssv, String name, double diemth, double diemlt)
    {
        this.mssv = mssv;
        this.name = name;
        this.diemlt = diemlt;
        this.diemth = diemth;
    }

    public void setmSSV(int mssv)
    {
        this.mssv = mssv;
    }

    public int getmSSV()
    {
        return this.mssv;
    }

    public void setnAme( String name)
    {
        this.name = name;
    }

    public String getnAme()
    {
        return this.name;
    }

    public void setdIem(double diemlt)
    {
        this.diemlt = diemlt;
    }

    public double getdIem()
    {
        return this.diemlt;
    }

    public void setDiem(double diemth)
    {
        this.diemth = diemth;
    }

    public double getDiem()
    {
        return this.diemth;
    }

    public double diemTrungBinh()
    {
        return (this.diemlt + this.diemth) / 2;
    }

    public String toString()
    {
        
        String string = " Ma So Sinh Vien: "+ this.mssv + " " + " Ten Sinh Vien: "+ this.name + " " + " Diem Trung Binh" + this.diemTrungBinh();
        return string;
    }

    Scanner input = new Scanner(System.in);

    public void nhap()
    {
        System.out.println("Nhap Mssv: ");
        this.mssv = input.nextInt();
        input.nextLine();
        System.out.println("Nhap ten: ");
        this.name = input.nextLine();
        System.out.println("Nhap diem: ");
        this.diemlt = input.nextDouble();
        System.out.println("Nhap diem: ");
        this.diemth = input.nextDouble();
    }



}
