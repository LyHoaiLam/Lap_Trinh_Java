package oo.games;

public class Player 
{
    int number = 0;
    void Guess()// Guess Đoán
    {
        number = (int) (Math.random()*10);
        System.out.println("I'am guessing ( TOI DANG DOAN ) "+ number);
        
    }    
}
