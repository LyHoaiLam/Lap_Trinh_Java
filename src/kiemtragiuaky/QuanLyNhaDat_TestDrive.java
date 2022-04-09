package kiemtragiuaky;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuanLyNhaDat_TestDrive 
{
    public static void main(String[] args) 
    {

        GiaoDichDat giaoDichDat2 = new GiaoDichDat();
        giaoDichDat2.Nhap_Thong_Tin();
        System.out.println(giaoDichDat2.toString());
        List<QuanLyNhaDat> danh_Sach_Giao_Dich = new ArrayList<>();

      


        /*GiaoDichNha giaoDichNha = new GiaoDichNha();
        giaoDichNha.Nhap_Thong_Tin();
        System.out.println(giaoDichNha.toString());*/

    }    
}
