package oo.tuan03.buoi06;

public class Inner_City_Bus extends Bus // Xe Bus Nội Thành
{
       private int so_Tuyen;
       private double so_KM_Di_Duoc;
       private double so_Tien_Loi_Tren_1KM = 14000;

       public void setSoKM_Di_Duoc(double so_KM_Di_Duoc) 
       {
           this.so_KM_Di_Duoc = so_KM_Di_Duoc;
       }

       public double getSoKM_Di_Duoc() 
       {
           return so_KM_Di_Duoc;
       }

       public void setSoTuyen(int so_Tuyen) 
       {
           this.so_Tuyen = so_Tuyen;
       }

       public int getSoTuyen() 
       {
           return so_Tuyen;
       }


       Inner_City_Bus()
       {
        
       }



       Inner_City_Bus(int bus_Code, String driver_Name, int so_Xe, int soTuyen, double doanhThu, int sp, double soKM_Di_Duoc)
       {
           super(bus_Code, driver_Name, so_Xe, doanhThu);
           this.so_KM_Di_Duoc = soKM_Di_Duoc;
           this.so_Tuyen = sp;
       }


       @Override
       public void Enter_Bus_Information() {
           super.Enter_Bus_Information();
           System.out.println("So Tuyen ");
           so_Tuyen = input.nextInt();
           System.out.println("So KM Di Duoc ");
           so_KM_Di_Duoc = input.nextDouble();
       }


       public double tinh_Tien_Xe_Noi_Thanh()
       {
            //return this.so_KM_Di_Duoc * this.so_Tien_Loi_Tren_1KM;
            super.doanhThu = this.so_KM_Di_Duoc * this.so_Tien_Loi_Tren_1KM;
            return super.doanhThu;

       }

       
       @Override
       public String toString() 
       {
        //super.doanhThu = this.tinh_Tien_Xe_Noi_Thanh();
            return "Inner City Bus: " + super.toString() + " / " + " So Tuyen: " + this.so_Tuyen
             + " / " + " So KM Di: " + this.so_KM_Di_Duoc + " / " + " Doanh Thu: " + this.tinh_Tien_Xe_Noi_Thanh();    
       }
}
