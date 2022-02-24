package oo;

public class IntSquare 
{
    double squareValue;
    double getSquareOperator(int value)
    {
        this.squareValue = value * value;
        return this.squareValue;
    }  

    double getSquare(int value)
    {
        this.calculateSquare(value);
       
        return this.squareValue;
    }

    void calculateSquare(int value)
    {
        this.squareValue = Math.pow(value, 2);
        //this.squareValue = value * value;
    }
    
    

   
}
