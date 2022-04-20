package onlaibaihoc.docvaghifile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import onlaibaihoc.QuanLySinhVien_DonGian;

public class Writing_Object 
{
    public static void main(String[] args) throws IOException 
    {
        //1
        FileOutputStream fileoutput = new FileOutputStream("hoailam.doc");     // Xử Lý Ngoại Lệ 

        //2
        ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);     // Xử Lý Ngoại Lệ



        QuanLySinhVien_DonGian quanLySinhVien_DonGian = new QuanLySinhVien_DonGian(2008110053, "Ly Hoai Lam", 7, 7);

        QuanLySinhVien_DonGian quanLySinhVien_DonGian2 = new QuanLySinhVien_DonGian(2008110053, "Ly Hoai Phong Phuong", 9, 9);

        List<QuanLySinhVien_DonGian> list = new ArrayList<>();

        list.add(quanLySinhVien_DonGian);
        list.add(quanLySinhVien_DonGian2);

        for (QuanLySinhVien_DonGian quanLySinhVien_DonGian333333333333 : list) 
        {
            System.out.println(quanLySinhVien_DonGian333333333333);    
        }
            
        objectoutput.close();

        
    }  
}
