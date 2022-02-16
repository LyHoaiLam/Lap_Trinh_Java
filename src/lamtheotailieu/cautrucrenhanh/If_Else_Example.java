package lamtheotailieu.cautrucrenhanh;

import java.util.Scanner;

public class If_Else_Example // Ví dụ
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double score;
        System.out.println("Enter your score: ");
        score = input.nextDouble();

        if(score < 4.0)// Dưới 4 rới trên 4 đậu
            System.out.println("Sorry. You've failed the course. ");// Thất bại trong khóa học
        else
            System.out.println("Congratulations ! You've passed the course. ");// Vượt qua khóa học
    }    
}
