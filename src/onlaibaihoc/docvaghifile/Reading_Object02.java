package onlaibaihoc.docvaghifile;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import onlaibaihoc.QuanLySinhVien_DonGian;

public class Reading_Object02
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        FileInputStream inFile = new FileInputStream("hoailam.doc");

        ObjectInputStream objectInputStream = new ObjectInputStream(inFile);
        
        List<QuanLySinhVien_DonGian> list = (List)objectInputStream.readObject();

        for (QuanLySinhVien_DonGian quanLySinhVien_DonGian : list) 
        {
            System.out.println(quanLySinhVien_DonGian);    
        }

        objectInputStream.close();
    }


    
}

