package studentK14;

import java.util.Scanner;

public class StudentK14_TestDrive 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
        StudenK14 studenK14 = new StudenK14();
        
        int cs = 5;
        while(cs != 2 )
        {
            studenK14.nhapThongTinStudent();      
            studenK14.show();
            System.out.println("1. Nhap Lai Thong Tin ");
            System.out.println("2. Thoat Ra");
            cs = input.nextInt();
            System.out.println("-----------------------------------------");
        }
        
        //studenK14.nhapThongTinStudent();
       
        //studenK14.show();
       
    }    
}
