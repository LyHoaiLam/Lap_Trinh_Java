package oo.thuexe;

public class Vehicle_TestDrive 
{
    public static void main(String[] args) 
    {
        Vehicle vehicle = new Vehicle("Hoai Lam", "Winner", 211, 1000);
        vehicle.thueVAT();
        System.out.println(vehicle.toString());

        Vehicle vehicle2 = new Vehicle();
        vehicle2.nhapThongTin();
        vehicle2.thueVAT();
        System.out.println(vehicle2.toString());
    }    
}
