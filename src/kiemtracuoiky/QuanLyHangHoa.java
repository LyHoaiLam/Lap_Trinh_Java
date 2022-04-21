package kiemtracuoiky;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;


public abstract class QuanLyHangHoa implements Serializable
{
    private String ma_Hang_Hoa;
    protected String  ten_Hang_Hoa;
    protected int so_Luong_Ton; 
    protected double don_Gia; 
    protected double thue_VAT = 0;
    public Scanner scanner = new Scanner(System.in);

    public void Nhap()
    {
        System.out.println("Nhap Ma Hang Hoa: ");
        this.ma_Hang_Hoa = scanner.nextLine();
        System.out.println("Ten Hang Hoa: ");
        this.ten_Hang_Hoa = scanner.nextLine();
        System.out.println("So Luong Ton Kho: ");
        this.so_Luong_Ton = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Don Gia: ");
        this.don_Gia = scanner.nextDouble();
        scanner.nextLine();
    }



    public QuanLyHangHoa NhapHangHoa()
    {
        QuanLyHangHoa quanLyHangHoa = null;

        System.out.println("[1]. Them Thuc Pham");
        System.out.println("[1]. Them Dien May");
        System.out.println("[3]. Them Sanh Su");
        System.out.println("Chon Loai Can Them: ");
        int loai_Hang = scanner.nextInt();
        scanner.nextLine();

        if(loai_Hang ==1)
        {
            this.Nhap();
            System.out.println("Nha Cung Cap: ");
            String nha_Cung_Cap = scanner.nextLine();
            
            quanLyHangHoa = new ThucPham(ma_Hang_Hoa, ten_Hang_Hoa, so_Luong_Ton, don_Gia, nha_Cung_Cap, new Date(), new Date());
        }

        if(loai_Hang == 2)
        {
            this.Nhap();
            System.out.println("Cong Suat KW: ");
            double cong_Xuat_KW = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Thoi Gian Bao Hanh: ");
            int thoi_Gian_Bao_Hanh = scanner.nextInt();
            quanLyHangHoa = new DienMay(ma_Hang_Hoa, ten_Hang_Hoa, so_Luong_Ton, don_Gia, cong_Xuat_KW, thoi_Gian_Bao_Hanh);
        }

        if(loai_Hang == 3)
        {
            this.Nhap();
            quanLyHangHoa = new SanhSu(ma_Hang_Hoa, ten_Hang_Hoa, so_Luong_Ton, don_Gia, new Date(), new Date());
        }

        return quanLyHangHoa;
    }

    public QuanLyHangHoa()
    {

    }

    public QuanLyHangHoa(String ma_Hang_Hoa, String ten_Hang_Hoa, int so_Luong_Ton, double don_Gia)
    {
        this.ma_Hang_Hoa = ma_Hang_Hoa;
        this.ten_Hang_Hoa = ten_Hang_Hoa;
        this.so_Luong_Ton = so_Luong_Ton;
        this.don_Gia = don_Gia;
    }

    private void setMa_Hang_Hoa(String ma_Hang_Hoa) 
    {
        this.ma_Hang_Hoa = ma_Hang_Hoa;
    }

    public String getMa_Hang_Hoa() 
    {
        return ma_Hang_Hoa;
    }

    public void setTen_Hang_Hoa(String ten_Hang_Hoa) 
    {
        this.ten_Hang_Hoa = ten_Hang_Hoa;
    }

    public String getTen_Hang_Hoa() 
    {
        return ten_Hang_Hoa;   
    }

    public void setSo_Luong_Ton(int so_Luong_Ton) 
    {
        this.so_Luong_Ton = so_Luong_Ton;
    }

    public int getSo_Luong_Ton() 
    {
        return so_Luong_Ton;
    }

    public void setDon_Gia(double don_Gia) 
    {
        this.don_Gia = don_Gia;
    }

    public double getDon_Gia() {
        return don_Gia;
    }

    public void setThue_VAT(double thue_VAT) 
    {
        this.thue_VAT = thue_VAT;
    }

    public  double getThue_VAT() 
    {
        return thue_VAT;
       
    }

    @Override
    public String toString() {
        return " Ten Hang Hoa: " + this.getTen_Hang_Hoa() + "/" + " Ma Hang Hoa: " + this.getMa_Hang_Hoa() + "/"
        + " So Luong Ton Kho: " + this.getSo_Luong_Ton() + "/" + " Don Gia: " + this.getDon_Gia() + "/"
        + " Thue VAT: " + this.getThue_VAT() + "/";
    }

}
