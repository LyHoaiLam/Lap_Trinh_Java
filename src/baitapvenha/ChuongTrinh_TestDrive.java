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
            HinhTron hinhTron = new HinhTron("Kkakakakaka");
            hinhTron.xoayHinhTron();
            hinhTron.phatAmThanhHinhTron();
        }

        if( chonChucNang == 2)
        {
            HinhTamGiac hinhTamGiac = new HinhTamGiac("Hhahahahah");
            hinhTamGiac.xoayHinhTamGiac();
            hinhTamGiac.phatAmThanhHinhTamGiac();
        }

        if( chonChucNang == 3)
        {
            HinhChuNhat hinhChuNhat = new HinhChuNhat("Hihihihi");
            hinhChuNhat.xoayHinhChuNhat();
            hinhChuNhat.phatAmThanhNhacHinhChuNhat();
        }

        if( chonChucNang == 4)
        {
            Amoeba amoeba = new Amoeba("Jjajajaj");
            amoeba.xoayHinhAmoeba();
            amoeba.phatAmThanhAmoeba();
        }

    
    }    
}
