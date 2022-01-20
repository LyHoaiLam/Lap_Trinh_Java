package baitapvenha;

import java.util.Scanner;

public class ChuongTrinh_TestDrive 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int chonChucNang;
        System.out.println("Menu");
        System.out.println("1. An Chuot Vao Hinh Tron ");
        System.out.println("2. An Chuot Vao Tam Giac ");
        System.out.println("3. An Chuot Vao Chu Nhat");
        System.out.println("4. An Chuot Vao Amoeba");

        System.out.println("An Nut ? ");

        chonChucNang = input.nextInt();

        if( chonChucNang == 1)
        {
            HinhTron hinhTron = new HinhTron("hinhTron.afl");
            hinhTron.xoayHinhTron();
            hinhTron.phatAmThanhHinhTron();
        }

        if( chonChucNang == 2)
        {
            HinhTamGiac hinhTamGiac = new HinhTamGiac("hinhTamGiac.afl");
            hinhTamGiac.xoayHinhTamGiac();
            hinhTamGiac.phatAmThanhHinhTamGiac();
        }

        if( chonChucNang == 3)
        {
            HinhChuNhat hinhChuNhat = new HinhChuNhat("hinhChuNhat.afl");
            hinhChuNhat.xoayHinhChuNhat();
            hinhChuNhat.phatAmThanhNhacHinhChuNhat();
        }

        if( chonChucNang == 4)
        {
            Amoeba amoeba = new Amoeba("hinhAmoeba.afl");
            amoeba.xoayHinhAmoeba();

            System.out.println("-----------------------------");
            Amoeba amoeba2 = new Amoeba("amoebe.hif", 2.3, 7);
            amoeba2.xoayHinhAmoeba();
        }

    
    }    
}
