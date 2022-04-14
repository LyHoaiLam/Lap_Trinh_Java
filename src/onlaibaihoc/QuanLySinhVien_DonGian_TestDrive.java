package onlaibaihoc;

import java.util.Scanner;

public class QuanLySinhVien_DonGian_TestDrive 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        QuanLySinhVien_DonGian sinhVien1 = new QuanLySinhVien_DonGian(2008110053, "Ly Hoai Lam", 4, 6);
        System.out.println(sinhVien1);    
        System.out.println();

        QuanLySinhVien_DonGian sinhVien2 = new QuanLySinhVien_DonGian(2005548997, "Trong Tuan", 5.6, 8.3);
        System.out.println(sinhVien2);
        System.out.println();

        
        System.out.println("Nhap Ma So Sinh Vien: ");
        int ma_So_Sinh_Vien = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap Ho Va Tem");
        String ho_Va_Ten = scanner.nextLine();
        System.out.println("Nhap Diem Ly Thuyet");
        double diem_Ly_Thuyet = scanner.nextDouble();
        System.out.println("Nhap Diem Thuc Hanh");
        double diem_Thuc_Hanh = scanner.nextDouble();
        
        QuanLySinhVien_DonGian sinhVien3 = new QuanLySinhVien_DonGian(ma_So_Sinh_Vien, ho_Va_Ten, diem_Ly_Thuyet, diem_Thuc_Hanh);
        System.out.println(sinhVien3);
        

    }    
}
