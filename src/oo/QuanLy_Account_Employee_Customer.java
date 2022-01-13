package oo;

import java.util.Scanner;

public class QuanLy_Account_Employee_Customer 
{
    public static void main(String[] args) 
    {
        Accountt accountt = new Accountt();
        Employee employee = new Employee();
        Customer customer = new Customer();

        Scanner input = new Scanner(System.in);
        
        int chucNang;

        do
        {
            System.out.println("MENU");
            System.out.println("1. Account ");
            System.out.println("2. Employee ");
            System.out.println("3. Customer ");
            System.out.println("4. Out ");
            System.out.println("Chon Chuc Nang: ");
            chucNang = input.nextInt();

            switch(chucNang)
            {
                case 1:
                {
                    accountt.Show();
                    accountt.deposit();
                    accountt.Show();
                    accountt.withdraw();
                    accountt.Show();
                }break;

                case 2:
                {
                    employee.Nhaptt();
                    employee.Show();
                }break;

                case 3:
                {
                    customer.nhaptt();;
                    customer.show();
                }break;
            }
        }while(chucNang >= 1 && chucNang <= 5);

    }    
}
