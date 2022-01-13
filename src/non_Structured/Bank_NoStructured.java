package non_Structured;
// Không cấu trúc

import java.util.Scanner;

public class Bank_NoStructured 
{  
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        int account_number = 2008110053;
        int account_balance = 35000;  

        System.out.println("Nhap SO Tien Can Nap: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balance = account_balance + depositAmount;

        System.out.println("Thong Tin: ");
        System.out.println("Account_Number: "+ account_number);
        System.out.println("Account_Balance: "+ account_balance);
        System.out.println("--------------------------------");

        System.out.println("Nhap So Tien Can Rut: ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_balance = account_balance - withdrawAmount;

        System.out.println("Thong Tin: ");
        System.out.println("Account_Number: "+ account_number);
        System.out.println("Account_Balance: "+ account_balance);
        System.out.println("--------------------------------");

        System.out.println("Nhap SO Tien Can Nap: ");
        depositAmount = input.nextInt();
        account_balance = account_balance + depositAmount;

        System.out.println("Thong Tin: ");
        System.out.println("Account_Number: "+ account_number);
        System.out.println("Account_Balance: "+ account_balance);
        System.out.println("--------------------------------");

        System.out.println("Nhap So Tien Can Rut: ");
        withdrawAmount = input.nextInt();
        account_balance = account_balance - withdrawAmount;

        System.out.println("Thong Tin: ");
        System.out.println("Account_Number: "+ account_number);
        System.out.println("Account_Balance: "+ account_balance);
        System.out.println("--------------------------------");
        
        
        

       
    }    

    
}
