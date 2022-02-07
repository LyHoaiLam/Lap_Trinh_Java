package oo.student01;

public class Student01_TestDrive 
{
    public static void main(String[] args) 
    {
        Student01 student021 = new Student01("Hoai Linh", "Nu", 15, "CNTT", 5);  
        student021.show(); 
        Student01 student022 = new Student01("Vu Duong", "Nam", 21, "CNTT", 7); 
        student022.show();
        Student01 student023 = new Student01("Sang", "Nam", 22, "CNTT", 9); 
        student023.show();    
        Student01 student024 = new Student01("Hoai Lam", "Nam");
        student024.show();
    }    
}
