package oo.hinhchunhat;

public class HinhChuNhat_TestDrive 
{
    public static void main(String[] args) 
    {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.setChieuDai(5);
        hinhChuNhat.setChieuRong(6);
        hinhChuNhat.dienTich();
        hinhChuNhat.chuVi();
        System.out.println(hinhChuNhat.toString());    
    }
}
