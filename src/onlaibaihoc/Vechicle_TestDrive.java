package onlaibaihoc;

import java.util.Scanner;

public class Vechicle_TestDrive 
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten Chu Xe: ");
        String ten_Chu_Xe = scanner.nextLine();
        System.out.println("Nhap Ten Loai Xe: ");
        String loai_Xe = scanner.nextLine();
        System.out.println("Nhap Dung Tich Xe: ");
        double dung_Tich = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap Gia Tri Xe: ");
        double tri_Gia = scanner.nextDouble();
        Vechicle vechicle1 = new Vechicle(ten_Chu_Xe, loai_Xe, dung_Tich, tri_Gia);
        System.out.println(vechicle1.toString());
    }
}
