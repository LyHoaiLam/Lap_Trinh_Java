package kiemtracuoiky;

import java.io.Serializable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public abstract class QuanLyHangHoa implements Serializable
{
    private String ma_Hang_Hoa;
    protected String  ten_Hang_Hoa;
    protected int so_Luong_Ton; 
    protected double don_Gia; 
    protected double thue_VAT = 0;
    public Scanner scanner = new Scanner(System.in);

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
    public String toString() 
    {
        //SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        Locale locale = new Locale("vi", "VN");
        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(locale);
        return " Ten Hang Hoa: " + this.getTen_Hang_Hoa() + "/" + " Ma Hang Hoa: " + this.getMa_Hang_Hoa() + "/"
        + " So Luong Ton Kho: " + this.getSo_Luong_Ton() + "/" + " Don Gia: " + tienVietNam.format(this.don_Gia) + "/"
        + " Thue VAT: " + this.getThue_VAT() + "/";
    }

}
