package onlaibaihoc;

import java.util.Scanner;

public class HinhChuNhat_OnTap_TestDrive 
{
    public static void main(String[] args) 
    {
        double chieu_Dai;
        double chieu_Rong;
        Scanner scanner = new Scanner(System.in);
        
        HinhChuNhat_OnTap hinhChuNhat_OnTap = new HinhChuNhat_OnTap();

        System.out.println("Nhap Chieu Dai: ");      
        chieu_Dai = scanner.nextDouble();
        hinhChuNhat_OnTap.setChieu_Dai(chieu_Dai);
        
        System.out.println("Nhap Chieu Rong: ");
        chieu_Rong = scanner.nextDouble();
        hinhChuNhat_OnTap.setChieu_Rong(chieu_Rong);

        System.out.println(hinhChuNhat_OnTap.tinh_Chu_Vi());
        System.out.println(hinhChuNhat_OnTap.tinh_Dien_Tich());

        System.out.println(hinhChuNhat_OnTap);





    }    
}
