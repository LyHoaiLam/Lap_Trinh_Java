package kiemtracuoiky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DanhSachQuanLyHangHoa 
{
    public Scanner scanner = new Scanner(System.in);

    private int so_Luong_ThucPham;
    private int so_Luong_DienMay;
    private int so_Luong_SanhSu;
    private int tong_So_Luong_Tat_Ca_Cac_Hang_Hoa;

    public int getSo_Luong_DienMay() 
    {
        return so_Luong_DienMay;
    }

    public int getSo_Luong_SanhSu() 
    {
        return so_Luong_SanhSu;
    }

    public int getSo_Luong_ThucPham() 
    {
        return so_Luong_ThucPham;
    }

    public int getTong_So_Luong_Tat_Ca_Cac_Hang_Hoa() 
    {
        return tong_So_Luong_Tat_Ca_Cac_Hang_Hoa;
    }
    

    List<QuanLyHangHoa> danhSachQuanLyHangHoa = new ArrayList<>();

    public void Add_QuanLyHangHoa(QuanLyHangHoa quanLyHangHoa)
    {        
        this.danhSachQuanLyHangHoa.add(quanLyHangHoa);
    }

    public void ReMoVe_QuanLyHangHoa(int index)
    {
        this.danhSachQuanLyHangHoa.remove(index);
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
        
        this.danhSachQuanLyHangHoa.set(index, quanLyHangHoa);
    }

    public QuanLyHangHoa tim_Hang_Hoa(String nhap_Ma_Hang_Hoa)
    {
        QuanLyHangHoa quanLyHangHoa11 = null;
        for (QuanLyHangHoa quanLyHangHoa22 : danhSachQuanLyHangHoa) 
        {
            if(quanLyHangHoa22.getMa_Hang_Hoa().equalsIgnoreCase(nhap_Ma_Hang_Hoa));    
            {
                quanLyHangHoa11 = quanLyHangHoa22;
                System.out.println(quanLyHangHoa22);
                
                
            }
        }
        
        return quanLyHangHoa11;
    }

   
    public QuanLyHangHoa NhapHangHoa() throws ParseException
    {
        QuanLyHangHoa quanLyHangHoa = null;
            System.out.println("Nhap Ma Hang Hoa: ");
            String ma_Hang_Hoa = scanner.nextLine();
            System.out.println("Ten Hang Hoa: ");
            String ten_Hang_Hoa = scanner.nextLine();
            System.out.println("So Luong Ton Kho: ");
            int so_Luong_Ton = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Don Gia: ");
            double don_Gia = scanner.nextDouble();
            scanner.nextLine();

        System.out.println("Hang Hoa Ban Muo Them Vao Danh Sach Thuoc Loai Nao Duoi Day");
        System.out.println("[1]. Them Thuc Pham");
        System.out.println("[2]. Them Dien May");
        System.out.println("[3]. Them Sanh Su");
        System.out.println("Chon Loai Can Them: ");
        int loai_Hang = scanner.nextInt();
        scanner.nextLine();
        String ngay_San_Xuat;
        String ngay_Het_Han;
        String ngay_Nhap_Kho;

       
        if(loai_Hang ==1)
        {
            System.out.println("Nha Cung Cap: ");
            String nha_Cung_Cap = scanner.nextLine();
            System.out.println("Nhap Ngay San Xuat: ");
            ngay_San_Xuat = scanner.nextLine();
            System.out.println("Nhap Ngay Het Han: ");
            ngay_Het_Han = scanner.nextLine();

            Date datesx = new SimpleDateFormat("dd/MM/yyyy").parse(ngay_San_Xuat);
            Date dateshh= new SimpleDateFormat("dd/MM/yyyy").parse(ngay_Het_Han);

            
            
            quanLyHangHoa = new ThucPham(ma_Hang_Hoa, ten_Hang_Hoa, so_Luong_Ton, don_Gia, nha_Cung_Cap, datesx,dateshh);
        }

        if(loai_Hang == 2)
        {
            System.out.println("Cong Suat KW: ");
            double cong_Xuat_KW = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Thoi Gian Bao Hanh: ");
            int thoi_Gian_Bao_Hanh = scanner.nextInt();
            
            quanLyHangHoa = new DienMay(ma_Hang_Hoa, ten_Hang_Hoa, so_Luong_Ton, don_Gia, cong_Xuat_KW, thoi_Gian_Bao_Hanh);
        }

        if(loai_Hang == 3)
        {
            System.out.println("Ngay San Xuat: ");
            ngay_San_Xuat = scanner.nextLine();
            System.out.println("Ngay Nhap Kho: ");
            ngay_Nhap_Kho = scanner.nextLine();

            Date datesx0 = new SimpleDateFormat("dd/MM/yyyy").parse(ngay_San_Xuat);
            Date datesnk= new SimpleDateFormat("dd/MM/yyyy").parse(ngay_Nhap_Kho);

            quanLyHangHoa = new SanhSu(ma_Hang_Hoa, ten_Hang_Hoa, so_Luong_Ton, don_Gia, datesx0, datesnk);
        }

        return quanLyHangHoa;
    }

    
   
     
}
