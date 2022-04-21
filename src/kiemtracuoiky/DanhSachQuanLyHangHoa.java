package kiemtracuoiky;

import java.util.ArrayList;
import java.util.List;

public class DanhSachQuanLyHangHoa 
{

    private int so_Luong_ThucPham;
    private int so_Luong_DienMay;
    private int so_Luong_SanhSu;
    private int tong_So_Luong_Tat_Ca_Cac_Hang_Hoa;

    List<QuanLyHangHoa> danhSachQuanLyHangHoa = new ArrayList<>();

    public void Add_QuanLyHangHoa(QuanLyHangHoa quanLyHangHoa)
    {        
        danhSachQuanLyHangHoa.add(quanLyHangHoa);
    }

    public void ReMoVe_QuanLyHangHoa(QuanLyHangHoa quanLyHangHoa)
    {
        danhSachQuanLyHangHoa.remove(quanLyHangHoa);
    }

    public void Print_Information_QuanLyHangHoa()
    {
        for (QuanLyHangHoa quanLyHangHoa : danhSachQuanLyHangHoa) 
        {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(quanLyHangHoa);    
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public void Update_QuanLyHangHoa(int index,QuanLyHangHoa quanLyHangHoa)
    {
        danhSachQuanLyHangHoa.set(index, quanLyHangHoa);
    }

    
   
     
}
