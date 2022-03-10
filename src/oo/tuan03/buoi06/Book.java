package oo.tuan03.buoi06;

public class Book 
{
    protected double unitPrice;
    protected double amount;
    private boolean status; 
    private Day_Book day_Book;
    protected final double thueVAT = 0.03;

   double Bill()
   {
        if(status == true)
        {
            return this.amount * this.unitPrice;
        } 
        else
        {
            return this.amount * this.unitPrice ;
        }
   
   }
  
  
    
    
    
}
