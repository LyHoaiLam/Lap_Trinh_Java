package oo.tuan03.buoi06;

public class Suburban_Bus extends Bus // Xe Bus Ngoại Thành
{
    private String noi_Den;
    private double so_Ngay_Di_Duoc;
    private double so_Tien_Mot_Ngay_Di = 13000;

    public void set_Noi_Den(String noi_Den)
    {
        this.noi_Den = noi_Den;
    }

    public String get_Noi_Den()
    {
        return this.noi_Den;
    }

    public void set_So_Ngay_Di(double so_Ngay_Di_Duoc)
    {
        this.so_Ngay_Di_Duoc = so_Ngay_Di_Duoc;
    }

    public double get_So_Ngay_Di()
    {
        return this.so_Ngay_Di_Duoc;
    }

    public Suburban_Bus()
    {
        //super(); Constructor con tự động kích hoạt Constructor của Class cha bằng từ khóa super(). JaVa tự thêm mà chúng ta ko thể thấy được
        this.so_Ngay_Di_Duoc = 0 ;
        this.noi_Den = "" ;
    }

    

    public Suburban_Bus(int bus_Code, String driver_Name, int so_Xe, double doanhThu, String noi_Den, double so_Ngay_Di_Duoc)// Constructor 6 Tham Số ( Class Con ). Có Supper. Constructor Class Cha
    {
        super(bus_Code, driver_Name, so_Xe, doanhThu);
        this.noi_Den = noi_Den;
        this.so_Ngay_Di_Duoc = so_Ngay_Di_Duoc;
    }

    public double Tinh_Tien_Xe_Ngoai_Thanh()
    {
        return this.so_Tien_Mot_Ngay_Di * this.so_Ngay_Di_Duoc;
    }


    @Override
    public void Enter_Bus_Information() 
    {
        super.Enter_Bus_Information();
        System.out.println("Noi Den: ");
        this.noi_Den = input.nextLine();
        System.out.println("So Ngay Di Duoc: ");
        this.so_Ngay_Di_Duoc = input.nextDouble();
    }

    @Override
    public String toString() 
    {

       
        return " Suburban Bus: " + super.toString() + " / " + " Noi Den: " + this.noi_Den + " / "
         + " So Ngay Di Duoc: " + this.so_Ngay_Di_Duoc + " / " + " Doanh Thu: " + this.doanhThu;     
    }

    


}
