package lamtheotailieu.cautrucrenhanh;

import java.util.Scanner;

public class Switch_Example 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you grade");// Nhập điểm
        String userInpput = input.nextLine();

        char grade = userInpput.charAt(0);

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
    }    
}
