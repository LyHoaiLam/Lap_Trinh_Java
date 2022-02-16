package lamtheotailieu;

public class AppleProgram 
{
    public static void main(String[] args) 
    {
        int totalApples;// Khai báo biến địa phương có kiểu là int, không kèm theo khời tạo gía trị
        int numberApples = 5;// Khai báo biến địa phương có kèm theo khởi tạo giá trị
        int applePerBasket = 10;

        totalApples = numberApples * applePerBasket;
        System.out.println("Number of Apples is: "+ totalApples);

    }    
}
