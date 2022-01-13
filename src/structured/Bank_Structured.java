package structured;
import java.util.Scanner;
// Global toàn cục

public class Bank_Structured 
{
    // Biến toàn cục
    static int account_number = 2008110053;
    static int account_balance = 35000;
    static Scanner input;

    // data Employee
    // data Customer
    static String employee_Name;// Tên nhân viên
    static double salary;// lương

    static String customer_Name;// Tên khác hàng
    static String address;// Địa chỉ



    public static void main(String[] args) 
    {
        input = new Scanner(System.in);

        // Biến cục bộ
        //int account_number = 2008110053;
        //int account_balance = 35000;
        //Scanner input = new Scanner(System.in);
        //Biến cục bộ các Funcion không sài được
        Show();
        deposit();
        Show();
        withdraw();
        Show();

    }

    static void deposit()// Nạp Tiền
    {
        System.out.println("Nhap SO Tien Can Nap: ");
        int depositAmount;// Số lượng tiền gửi
        depositAmount = input.nextInt();
        account_balance = account_balance + depositAmount;
        // account_balance += depositAmount
    }

    static void withdraw()// Rút Tiền
    {
        System.out.println("Nhap So Tien Can Rut: ");
        int withdrawAmount;// Số lượng tiền nạp
        withdrawAmount = input.nextInt();
        //account_balance = account_balance - withdrawAmount; 
        account_balance -= withdrawAmount;
    }

    static void Show()// Xuất thông tin ra màn hình
    {
        System.out.println("Print Account Information: ");
        System.out.println("Account Number: "+ account_number);
        System.out.println("Account Balance: "+ account_balance);
        System.out.println("--------------------------------");
    }    

    static void getEmployee()
    {
        employee_Name = " ";

    }

    static void getSalary()
    {
        salary = 500;
    }

    static String getCustomerName()
    {
        return customer_Name;
    }

    static String getCustomerInfo()
    {
        return customer_Name + address;
    }

}
