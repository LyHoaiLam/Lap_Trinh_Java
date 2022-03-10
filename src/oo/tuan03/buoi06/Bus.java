package oo.tuan03.buoi06;

import java.util.Scanner;

public class Bus 
{

    Scanner input = new Scanner(System.in);

    private int bus_Code;// Mã Chuyến Xe
    private String driver_Name;// Tên Tài Xế
    private int soXe;
    private double revenue;// Doanh Thu

    protected final double soTienTren1KM = 13000;
    
    public void set_Ma_So_Chuyen_Xe(int bus_Code)
    {
        this.bus_Code = bus_Code;
    }

    public int get_Ma_So_Chyen_Xe()
    {
        return this.bus_Code;
    }

    public void set_Ho_Ten_Tai_Xe(String driver_Name)
    {
        this.driver_Name = driver_Name;
    }

    public String get_Ho_Ten_Tai_Xe()
    {
        return this.driver_Name;
    }

    public void set_So_Tuyen(int soTuyen)
    {
        this.soXe = soTuyen;
    }

    public int get_So_Tuyen()
    {
        return this.soXe;
    }


    public void set_Doanh_Thu(double revenue)
    {
        this.revenue = revenue;
    }

    public double get_Doanh_Thu()
    {
        return this.revenue;
    }

    public Bus()
    {

    }

    public Bus(int bus_Code, String driver_Name, int soTuyen)
    {
        this.set_Ma_So_Chuyen_Xe(bus_Code);
        this.set_Ho_Ten_Tai_Xe(driver_Name);
        this.set_So_Tuyen(soTuyen);
    }

    public void Enter_Bus_Information()
    {
        System.out.println("BUS CODE ? : ");
        this.bus_Code = input.nextInt();
        input.nextLine();
        System.out.println("DRIVER IS NAME ? : ");
        this.driver_Name  = input.nextLine();
        System.out.println("So Tuyen Xe: ");
        this.soXe = input.nextInt();
    }

    public void Print_Bus_Information()
    {
        System.out.println("Bus Code: "+ this.bus_Code);
        System.out.println("Driver Is Name: "+ this.driver_Name);
        System.out.println("So Tuyen Xe: "+ this.soXe);
        System.out.println("Gia Tien Chuyen Xe Thu Duoc La: "+ this.revenue);
    }

    public String toString()
    {
        String string = " BUS CODE IS : " + this.bus_Code + " DRIVER NAME IS: "+ this.driver_Name + " SO TUYEN XE: " + this.soXe;
        
        return string;
    }

   
}
