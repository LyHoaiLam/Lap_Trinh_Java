package lamtheotailieu.cautrucrenhanh;

import java.util.Scanner;

public class Switch_Example 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you grade");// Nhập điểm
        String userInpput = input.nextLine();

        char grade = userInpput.charAt(0);// 0 Lấy ký tự đầu tiên mà người nhập vào từ bàn phím ( Theo Câu Lệnh Switch A,B,C,D,F)

        switch(grade)
        {
            case 'A':
            {
                System.out.println("Excellent !"); // Tuyệt vời
                break;
            }

            case 'B':
            {
                System.out.println("Great !"); // Tuyệt
                break;
            }

            case 'C':
            case 'D':
                System.out.println("Well done !"); // Tốt
                break;
            case 'F':
            {
                System.out.println("Sorry, you failed. "); // Thất bại
                break;
            } 
            default:
            {
                System.out.println("Error ! Invalid grade. ");
            }
        }

        String name = "Hello World";
        char ch = name.charAt(6);// Vị trí số 6 của Chuỗi Hello World là "W"
        System.out.println("Vi tri thu 6 "+ch);
        System.out.println("Vi tri thu 4 "+ name.charAt(4));
        System.out.println("Vi tri thu 5 "+ name.charAt(5));
        System.out.println("Vi tri thu 7 "+ name.charAt(7));
        // Phương thức charAt() trả về giá trị Char của chuỗi tại vị trí có 
        // chỉ số index đc chỉ định. Index bắt đầu bằng 0
        // Tìm ký tư tại một vị trí cụ thể
        

    }    
}
