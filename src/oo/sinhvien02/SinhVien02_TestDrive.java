package oo.sinhvien02;

public class SinhVien02_TestDrive 
{
    public static void main(String[] args) 
    {
        SinhVien02 sinhVien02 = new SinhVien02(2008110053, "Hoai Lam", 7, 5);
        System.out.println(sinhVien02.toString());   
        
        SinhVien02 sinhVien03 = new SinhVien02(2008110053, "Vu Khang", 7, 6);
        System.out.println(sinhVien03.toString());   

        SinhVien02 sinhVien04 = new SinhVien02();
        sinhVien04.nhap();
        System.out.println(sinhVien04.toString());   
    }    
}
