package oo.tuan03.buoi06;

public class Inner_City_Bus extends Bus // Xe Bus Nội Thành
{
       private int soTuyen;
       private double soKM_Di_Duoc;

       public void setSoKM_Di_Duoc(double soKM_Di_Duoc) 
       {
           this.soKM_Di_Duoc = soKM_Di_Duoc;
       }

       public double getSoKM_Di_Duoc() 
       {
           return soKM_Di_Duoc;
       }

       public void setSoTuyen(int soTuyen) 
       {
           this.soTuyen = soTuyen;
       }

       public int getSoTuyen() 
       {
           return soTuyen;
       }

       Inner_City_Bus()// ConsTructor Mặc Định ( Class Con )
       {

       }

       Inner_City_Bus(int bus_Code, String driver_Name, int soTuyen, double doanhThu, int sp, double soKM_Di_Duoc)// Constructor 6 Tham Số ( Class Con ). Có Super.Constructor Class Cha Bên Trong
       {
           super(bus_Code, driver_Name, doanhThu);
           this.soKM_Di_Duoc = soKM_Di_Duoc;
           this.soTuyen = sp;
       }

       @Override
       public void Enter_Bus_Information() {
           super.Enter_Bus_Information();
           System.out.println("So Tuyen ");
           soTuyen = input.nextInt();
           System.out.println("So KM Di Duoc ");
           soKM_Di_Duoc = input.nextDouble();
       }

       public double So_Tien_Thu_Duoc_La()// Tính Tiền Chuyến Xe
       {
           return this.soKM_Di_Duoc * super.soTienTren1KM;
       }

       @Override
       public String toString() 
       {
            return "Inner City Bus: " + super.toString() + " So Tuyen: " + this.soTuyen + " So KM Di: " + this.soKM_Di_Duoc + " Doanh Thu: " + this.So_Tien_Thu_Duoc_La();    
       }
}
