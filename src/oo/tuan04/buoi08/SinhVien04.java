package oo.tuan04.buoi08;

import java.util.Scanner;

public class SinhVien04 
{
    private int ma_So_Sinh_Vien;
    private String ho_Va_Ten;
    private String di_Chi;
    private int so_Dien_Thoai;
    protected Scanner scanner = new Scanner(System.in);

    public void setMa_So_Sinh_Vien(int ma_So_Sinh_Vien) 
    {
        this.ma_So_Sinh_Vien = ma_So_Sinh_Vien;
    }

    public int getMa_So_Sinh_Vien() 
    {
        return ma_So_Sinh_Vien;
    }

    public void setHo_Va_Ten(String ho_Va_Ten) 
    {
        this.ho_Va_Ten = ho_Va_Ten;
    }
    
    public String getHo_Va_Ten() 
    {
        return ho_Va_Ten;
    }

    public void setDi_Chi(String di_Chi) 
    {
        this.di_Chi = di_Chi;
    }

    public String getDi_Chi() 
    {
        return di_Chi;
    }

    public void setSo_Dien_Thoai(int so_Dien_Thoai) 
    {
        this.so_Dien_Thoai = so_Dien_Thoai;
    }

    public int getSo_Dien_Thoai() 
    {
        return so_Dien_Thoai;
    }

    SinhVien04()
    {

    }

    SinhVien04(int ma_So_Sinh_Vien, String ho_Va_Ten, String di_Chi, int so_Dien_Thoai)
    {
        this.setMa_So_Sinh_Vien(ma_So_Sinh_Vien);
        this.setHo_Va_Ten(ho_Va_Ten);
        this.setDi_Chi(di_Chi);
        this.setSo_Dien_Thoai(so_Dien_Thoai);
    }

    public void Input_Information()
    {
        System.out.println("Nhap Ma So Sinh Vien: ");
        this.ma_So_Sinh_Vien = scanner.nextInt();
        System.out.println("Nhap Ho Va Ten Sinh Vien: ");
        this.ho_Va_Ten = scanner.nextLine();
        System.out.println("Dia Chi Sinh Vien: ");
        this.di_Chi = scanner.nextLine();
        System.out.println("So Dien Thoai Sinh Vien: ");
        this.so_Dien_Thoai = scanner.nextInt();
    }

    @Override
    public String toString() 
    {
        return " Ma So Sinh Vien: " + this.getMa_So_Sinh_Vien() + " / " + " Ho Va Ten: " + this.getHo_Va_Ten()
         + " / " + " Dia Chi: " + this.getDi_Chi() + " / " + "So Dien Thoai: " + this.getSo_Dien_Thoai();
    }
}
