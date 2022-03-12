package oo.tuan04.buoi08;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham 
{
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date dateSanXuat;
    private Date dateHetHan;
    

    private void setMaHang(String maHang) 
    {
        if(maHang != null)
        {
            this.maHang = maHang;
        }
        else
        {
            System.out.println("Ma Hang Khong Duoc Rong");
            this.maHang = " 3999 Default";// Mã Hàng Mặc Định 
        }
    } 

    public String getMaHang() 
    {
        return maHang;
    }

    @Override
    public String toString() 
    {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");// Ngày Việt Nam
        Locale locale = new Locale("vi", "VN");// Chuẩn Việt Nam
        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(locale);// Tiền Việt Nam
        return " HangThucPham " + " | "+ " DON GIA: " + tienVietNam.format(donGia) + " / " + " MA HANG: " + this.maHang + " / " +
        " NGAY SAN XUAT: " + ngayVietNam.format(dateSanXuat) + " / " + " NGAY HET HAN: " + ngayVietNam.format(dateHetHan);
    }



    public void setTenHang(String tenHang)    
    {
        if(tenHang  != null)
        {
            this.tenHang = tenHang;
        }
        else
        {
            System.out.println("Ten Hang Khong Duoc De Rong");
            this.tenHang = "Hoai Lam";
        }
    }

    public String getTenHang() 
    {
        return tenHang;
    }



    public void setDonGia(double donGia) 
    {
        if(donGia > 0)
        {
            this.donGia = donGia;
        }
        else
        {
            System.out.println("DON GIA PHAI LON HON KHONG");
        }
    }

    public double getDonGia() 
    {
        return donGia;
    }



    public void setDateSanXuat(Date dateSanXuat) 
    {
        this.dateSanXuat = dateSanXuat;
    }

    public Date getDateSanXuat() 
    {
        return dateSanXuat;
    }



    public void setDateHetHan(Date dateHetHan) 
    {
        if(dateHetHan != null)
        {
            if(dateHetHan.after(this.dateSanXuat))
            {
                this.dateHetHan = dateHetHan;
                System.out.println("5444848");
            }
                else
                {
                    System.out.println("Ngay Het Han Phai Sau Ngay San Xuat");
                    this.dateHetHan = new Date();// Ngày Hiện Tại
                }
        }
        else
        {
            System.out.println("Ngay Het Hna Khong Duoc De Rong");
            this.dateHetHan = new Date();// Ngày Hiện Tại
        }            
    }

    public Date getDateHetHan() 
    {
        return dateHetHan;
    }



    public HangThucPham()
    {

    }


    public HangThucPham(String maHang)
    {
        this.setMaHang(maHang);
    }


    public HangThucPham(String maHang, String tenHang, double donGia, Date dateSanXuat, Date dateHetHan)  
    {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setDateSanXuat(dateSanXuat);
        this.setDateHetHan(dateHetHan);
    }


    public boolean KiemTraHHSD()
    {
        boolean isHetHan = false;// Còn Hạn
        if(this.dateHetHan.before(new Date()))
        {
            isHetHan = true;
        }
        return isHetHan;
    }


}
