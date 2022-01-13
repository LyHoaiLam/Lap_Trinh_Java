package oo;

import java.util.Scanner;

public class Employee 
{
    String name;
    int old;
    String address;

    Scanner input = new Scanner(System.in);
    
    void Nhaptt()
    {
        System.out.println("Nhap Ten: ");
        name = input.nextLine();
        System.out.println("Nhap Tuoi: ");
        old = input.nextInt();
        input.nextLine();
        System.out.println("Nhap Dia Chi: ");
        address = input.nextLine();
    }

    void Show()
    {
        System.out.println("Name: "+ name);
        System.out.println("Old: "+ old);
        System.out.println("Address: "+ address);
    }
}
