package studentK14;

import java.util.Scanner;

public class StudentK14_TestDrive 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        StudenK14 studenK14m = new StudenK14("Duy Nhat", 20051132, 21, "Tp HCM");
        studenK14m.show();
        StudenK14 studenK14mm = new StudenK14("Thi Tam", 200811005, 20, "Binh Dinh");
        studenK14mm.show();
        StudenK14 studenK14mmm = new StudenK14("Huynh Nhu",2222222, 21, "Ca Mau");
        studenK14mmm.show();

        StudenK14 studenK14 = new StudenK14();
        
        int cs = 5;
        while(cs != 2 )
        {
            studenK14.nhapThongTinStudent();      
            studenK14.show();
            System.out.println("1. Nhap Tieo ");
            System.out.println("2. Thoat Ra");
            cs = input.nextInt();
            System.out.println("-----------------------------------------");
        }
        
        //studenK14.nhapThongTinStudent();
       
        //studenK14.show();
       
    }    
}
