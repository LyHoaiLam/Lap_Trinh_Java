package oo.thuexe;

import java.util.Scanner;

public class Vehicle 
{
    private String nameKhac;
    private String nameXe;    
    private double dungTich;
    private double giaXe;
    private double VAT;
    Scanner input = new Scanner(System.in);

    public void nhapThongTin()
    {
        System.out.println("Ten Chu Xe: ");
        this.nameKhac = input.nextLine();
        System.out.println("Ten Xe: ");
        this.nameXe = input.nextLine();
        System.out.println("Dung Tich Xi Lan Xe: ");
        this.dungTich = input.nextDouble();
        System.out.println("Gia Xe: ");
        this.giaXe = input.nextDouble();
    }

    public void setNameKhach(String nameKhach)
    {
         this.nameKhac = nameKhach;
    }

    public String getNameKhach()
    {
        return this.nameKhac;
    }

    public void setNameXe(String nameXe)
    {
        this.nameXe = nameXe;
    }

    public String getNameXe()
    {
        return this.nameXe;
    }

    public void setDungTich(double dungTich)
    {
        this.dungTich = dungTich;
    }

    public double getDungTich()
    {
        return this.dungTich;
    }

    public void setGiaXe(double giaXe)
    {
        this.giaXe = giaXe;
    }

    public double getGiaXe()
    {
        return this.giaXe;
    }

    Vehicle()
    {

    }

    Vehicle(String khach, String xe, double dungtich, double gia)
    {
        this.nameKhac = khach;
        this.nameXe = xe;
        this.dungTich = dungtich;
        this.giaXe = gia;
    }

    public double thueVAT()
    {
        if(this.dungTich < 100)
        {
            VAT = giaXe *0.1;          
        }

        if(this.dungTich <= 200)
        {
            VAT = giaXe *0.3;          
        }
        else
        {
            VAT = giaXe * 0.5;           
        }

        return VAT;      
    }

    public String toString()
    {
        String string = " Ho Ten Chu Xe: " + this.nameKhac + " / " + " Ten Xe Cua Khac: "+ this.nameXe + " / " + " Dung Tich Xi Lan: "+ this.dungTich +" / " + " Gia Xe: "+ this.giaXe + " / " + " Thue VAT "+ this.VAT;
        return string;
    }


}
