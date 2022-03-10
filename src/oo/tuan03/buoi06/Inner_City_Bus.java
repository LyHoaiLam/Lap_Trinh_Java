package oo.tuan03.buoi06;

public class Inner_City_Bus extends Bus
{
       private int soTuyen;
       private double soKM_Di_Duoc;

       @Override
       public void Enter_Bus_Information() {
           super.Enter_Bus_Information();
           System.out.println("So Tuyen ");
           soTuyen = input.nextInt();
           System.out.println("So KM Di Duoc ");
           soKM_Di_Duoc = input.nextDouble();
       }

       public double So_Tien_Thu_Duoc_La()
       {
           return this.soKM_Di_Duoc * super.soTienTren1KM;
       }
}
