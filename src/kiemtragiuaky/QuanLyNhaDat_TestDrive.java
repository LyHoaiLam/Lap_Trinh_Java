package kiemtragiuaky;

import java.util.Date;

public class QuanLyNhaDat_TestDrive 
{
    public static void main(String[] args) 
    {

        GiaoDichDat giaoDichDat2 = new GiaoDichDat();
        giaoDichDat2.Nhap_Thong_Tin();
        System.out.println(giaoDichDat2.toString());

        GiaoDichNha giaoDichNha = new GiaoDichNha();
        giaoDichNha.Nhap_Thong_Tin();
        System.out.println(giaoDichNha.toString());

    }    
}
