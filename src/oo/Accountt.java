package oo;
import java.util.Scanner;

public class Accountt 
{
    // data
    int account_number = 2008110053;
    int account_balance = 35000;
    Scanner input = new Scanner(System.in);

    Accountt()
    {
        
    }

    // funcion    

    void deposit()// Nạp Tiền
    {
        System.out.println("Nhap SO Tien Can Nap: ");
        int depositAmount;// Số lượng tiền gửi
        depositAmount = input.nextInt();
        account_balance = account_balance + depositAmount;
        // account_balance += depositAmount
    }

    void withdraw()// Rút Tiền
    {
        System.out.println("Nhap So Tien Can Rut: ");
        int withdrawAmount;// Số lượng tiền nạp
        withdrawAmount = input.nextInt();
        //account_balance = account_balance - withdrawAmount; 
        account_balance -= withdrawAmount;
    }

    void Show()// Xuất thông tin ra màn hình
    {
        System.out.println("Print Account Information: ");
        System.out.println("Account Number: "+ account_number);
        System.out.println("Account Balance: "+ account_balance);
        System.out.println("--------------------------------");
    }    

}
