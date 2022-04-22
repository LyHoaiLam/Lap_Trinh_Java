import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class String_Sang_Date 
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ngay: ");

        String sDate = scanner.nextLine();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
        System.out.println(sDate + "\t" + date);
        System.out.println("--------------");
        System.out.println(date);
    }

}

