package onlaibaihoc.docvaghifile;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import onlaibaihoc.QuanLySinhVien_DonGian;


public class Writing_Object02 
{
    public static void main(String[] args) throws IOException 
    {
        //1
        FileOutputStream fileoutput = new FileOutputStream("hoailam.doc");     // Xử Lý Ngoại Lệ 

        //2
        ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);     // Xử Lý Ngoại Lệ


        // HangThucPham

        QuanLySinhVien_DonGian quanLySinhVien_DonGian = new QuanLySinhVien_DonGian(2008110053, "Ly Hoai Lam", 7, 7);

        QuanLySinhVien_DonGian quanLySinhVien_DonGian2 = new QuanLySinhVien_DonGian(2008110053, "Ly Hoai Phong Phuong", 7, 7);

        objectoutput.writeObject(quanLySinhVien_DonGian);
        objectoutput.writeObject(quanLySinhVien_DonGian2);

        System.out.println(quanLySinhVien_DonGian);
        System.out.println(quanLySinhVien_DonGian2);
        
        objectoutput.close();

        
    }  
}
