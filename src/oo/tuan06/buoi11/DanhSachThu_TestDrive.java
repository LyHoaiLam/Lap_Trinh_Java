package oo.tuan06.buoi11;

import oo.tuan05.buoi09.Dog;

public class DanhSachThu_TestDrive 
{
    public static void main(String[] args) 
    {
        Dog dog = new Dog();
        DanhSachThu danhSachThu = new DanhSachThu();
        danhSachThu.them(dog);    
        Dog dogTinDuoc = (Dog) danhSachThu.timKiemTheoTenDog("cho");// Ép kiểu về Dog
    }    
}
