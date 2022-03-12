package oo.tuan03.buoi06;

import java.util.Scanner;

public class Bus 
{

    Scanner input = new Scanner(System.in);

    protected int bus_Code;// Mã Chuyến Xe
    protected String driver_Name;// Tên Tài Xế
    protected int soXe;
    protected double doanhThu;

    protected final double soTienTren1KM = 13000;// Số Tiền Trên 1km
    
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

    protected void set_So_Tuyen(int soTuyen)
    {
        this.soXe = soTuyen;
    }

    protected int get_So_Tuyen()
    {
        return this.soXe;
    }
    protected void set_Doanh_Thu(double doanhThu)
    {
        this.doanhThu = doanhThu;
    }

    protected double get_Doanh_Thu()
    {
        return this.doanhThu;
    }


    protected Bus()// Constructor mặc định
    {

    }

    protected Bus(int bus_Code, String driver_Name, double doanhThu)// Constructor 3 Tham Số ( Class Cha )
    {
        this.set_Ma_So_Chuyen_Xe(bus_Code);
        this.set_Ho_Ten_Tai_Xe(driver_Name);
        this.set_Doanh_Thu(doanhThu);
    }

    protected void Enter_Bus_Information()// Nhập
    {
        System.out.println("BUS CODE ? : ");
        this.bus_Code = input.nextInt();
        input.nextLine();
        System.out.println("DRIVER IS NAME ? : ");
        this.driver_Name  = input.nextLine();
    }

    protected void Print_Bus_Information()// In Thông Tin
    {
        System.out.println("Bus Code: "+ this.bus_Code);
        System.out.println("Driver Is Name: "+ this.driver_Name);
        System.out.println("So Tuyen Xe: "+ this.soXe);
    }

    public String toString()
    {
        String string = " BUS CODE IS : " + this.bus_Code + " DRIVER NAME IS: "+ this.driver_Name +
         " SO XE: " + this.soXe;
        
        return string;
    }

   
}
