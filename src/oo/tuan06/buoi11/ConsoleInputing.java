package oo.tuan06.buoi11;

import java.util.Scanner;

public class ConsoleInputing 
{
    private Scanner scanner = new Scanner(System.in);

    public Scanner get_Scanner()
    {
        return scanner;
    }

    /*public GiaoDich Nhap_Giao_Dich()
    {
        GiaoDich giaoDich = null;
        System.out.println("Nhap Code Giao Dich: ");
        String ma_Giao_Dich = scanner.nextLine();

        System.out.println("Nhap Don Gia: ");
        double don_Gia = scanner.nextDouble();
        System.out.println("Nhap Dien Tich: ");
        double dien_Tich = scanner.nextDouble();
        System.out.println("Nhap Ngay Giao Dich: ");
        String ngay_Giao_Dich = scanner.nextLine();
        System.out.println("Ban Chon Loai Giao Dich Nao 1.GIAOICHNHA // 2.GIAODICHDAT: ");
        int loai_Giao_Dich;
        if(loai_Giao_Dich == 1)
        {
            System.out.println("Nhap Dia Chi: ");
            String dia_Chi = scanner.nextLine();
            System.out.println("Nhap Loai Nha: ");
            String loai_Nha = scanner.nextLine();
            giaoDich = new GiaoDichNha0(ma_Giao_Dich, ngay_Giao_Dich, don_Gia, dien_Tich, loai_Nha, dia_Chi);
        }
        else
        {
            System.out.println("Nhap Loai Dat: ");
            char loai_Dat = scanner.nextLine().charAt(0);
            giaoDich = new GiaoDichDat0(ma_Giao_Dich, ngay_Giao_Dich, don_Gia, dien_Tich, loai_Dat);
        }

        return giaoDich;
    }*/


}



