package oo.tuan03.buoi06;

import java.util.Scanner;

public class Bus 
{

    Scanner input = new Scanner(System.in);

    protected int bus_Code;
    protected String driver_Name;
    protected int so_Xe;
    protected double doanhThu;

    protected void set_Ma_So_Chuyen_Xe(int bus_Code)
    {
        this.bus_Code = bus_Code;
    }

    protected int get_Ma_So_Chyen_Xe()
    {
        return this.bus_Code;
    }

    protected void set_Ho_Ten_Tai_Xe(String driver_Name)
    {
        this.driver_Name = driver_Name;
    }

    protected String get_Ho_Ten_Tai_Xe()
    {
        return this.driver_Name;
    }

    protected void set_So_Xe(int so_Xe)
    {
        this.so_Xe = so_Xe;
    }

    protected int get_So_Xe()
    {
        return this.so_Xe;
    }
    protected void set_Doanh_Thu(double doanhThu)
    {
        this.doanhThu = doanhThu;
    }

    protected double get_Doanh_Thu()
    {
        return this.doanhThu;
    }


    protected Bus()
    {

    }


    protected Bus(int bus_Code, String driver_Name, int so_Xe, double doanhThu)
    {

        this.set_Ma_So_Chuyen_Xe(bus_Code);
        this.set_Ho_Ten_Tai_Xe(driver_Name);
        this.so_Xe = so_Xe;
        this.set_Doanh_Thu(doanhThu);
    }


    protected void Enter_Bus_Information()// Hàm Nhập
    {
        System.out.println("BUS CODE ? : ");
        this.bus_Code = input.nextInt();
        input.nextLine();
        System.out.println("DRIVER IS NAME ? : ");
        this.driver_Name  = input.nextLine();
    }
    

    public String toString()
    {
        String string = " BUS CODE IS : " + this.bus_Code + " / " + " DRIVER NAME IS: "+ this.driver_Name
        + " / " + " SO XE: " + this.so_Xe;       
        return string;
    }

   
}
