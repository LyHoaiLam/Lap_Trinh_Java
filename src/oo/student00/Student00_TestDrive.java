package oo.student00;
import java.util.Scanner;

public class Student00_TestDrive 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
        Student00 studenK14 = new Student00();
        
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
    }    
}
