package oo;

import java.util.Scanner;

public class Customer 
{
    String name;
    int old;
    String address;
    
    Scanner input = new Scanner(System.in);

    void nhaptt()
    {
        System.out.println("Nhap Ten: ");
        name = input.nextLine();
        System.out.println("Nhap Tuoi: ");
        old = input.nextInt();
        input.nextLine();
        System.out.println("Nhap Dia Chi: ");
        address = input.nextLine();
    }

    void show()
    {
        System.out.println("Ten:"+ name);
        System.out.println("Tuoi"+ old);
        System.out.println("Dia Chi:"+ address);
    }
}
