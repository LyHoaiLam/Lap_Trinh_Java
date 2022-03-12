package oo.tuan03.buoi06;


public class Suburban_Bus extends Bus // Xe Bus Ngoại Thành
{
    private String noi_Den;
    private String soNgayDi;

    public void set_Noi_Den(String noi_Den)
    {
        this.noi_Den = noi_Den;
    }

    public String get_Noi_Den()
    {
        return this.noi_Den;
    }

    public void set_So_Ngay_Di(String soNgayDi)
    {
        this.soNgayDi = soNgayDi;
    }

    public String get_So_Ngay_Di()
    {
        return this.soNgayDi;
    }

    Suburban_Bus()
    {
        //super(); Constructor con tự động kích hoạt Constructor của Class cha bằng từ khóa super(). JaVa tự thêm mà chúng ta ko thể thấy được
        this.soNgayDi = "";
        this.noi_Den = "";
    }

    Suburban_Bus(int bus_Code, String driver_Name, int soTuyen, double doanhThu, String noi_Den, String soNgayDi)// Constructor 6 Tham Số ( Class Con ). Có Supper. Constructor Class Cha
    {
        super(bus_Code, driver_Name, doanhThu);
        this.noi_Den = noi_Den;
        this.soNgayDi = soNgayDi;
    }



    @Override
    public void Enter_Bus_Information() {
        super.Enter_Bus_Information();
        System.out.println("Noi Den: ");
        this.noi_Den = input.nextLine();
        System.out.println("So Ngay Di Duoc: ");
        this.soNgayDi = input.nextLine();
    }

    @Override
    public String toString() 
    {
        return " Suburban Bus: " + super.toString() + " Noi Den: " + this.noi_Den
         + " SO Ngay Di: " + this.soNgayDi + " Doanh Thu: " + this.doanhThu;     
    }


}
