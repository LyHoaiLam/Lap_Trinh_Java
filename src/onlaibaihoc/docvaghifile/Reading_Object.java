package onlaibaihoc.docvaghifile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import onlaibaihoc.QuanLySinhVien_DonGian;

public class Reading_Object 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        FileInputStream inFile = new FileInputStream("hoailam.doc");

        ObjectInputStream objectInputStream = new ObjectInputStream(inFile);
        
        QuanLySinhVien_DonGian quanLySinhVien_DonGian = (QuanLySinhVien_DonGian/*Ep Kieu*/)objectInputStream.readObject();
        QuanLySinhVien_DonGian quanLySinhVien_DonGian3 = (QuanLySinhVien_DonGian)objectInputStream.readObject();

        System.out.println(quanLySinhVien_DonGian);
        System.out.println(quanLySinhVien_DonGian3);
        
        objectInputStream.close();
    }
}
