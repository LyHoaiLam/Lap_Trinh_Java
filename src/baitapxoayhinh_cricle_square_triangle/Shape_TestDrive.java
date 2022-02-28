package baitapxoayhinh_cricle_square_triangle;

public class Shape_TestDrive 
{
    public static void main(String[] args) 
    {
         Cricle cricle = new Cricle();
         cricle.setSoundFile("Circle.AIF"); 
         cricle.Rotate();// this.playSound trong method Rotate() rồi nên không cần circle.playSound()
         System.out.println("-----------------------");

         Triangle triangle = new Triangle();
         triangle.setSoundFile("Triangle.HHJ");
         triangle.Rotate();
         System.out.println("-----------------------");

         Square square = new Square();
         square.setSoundFile("Square.DJK");
         square.Rotate();
         System.out.println("-----------------------");

         Amoeba amoeba = new Amoeba();
         amoeba.setXPoint(5);
         amoeba.setYPoint(10);
         amoeba.setSoundFile("HoaiLam.nknsdk");
         amoeba.RotateAmoeba();

         
    }    
}
