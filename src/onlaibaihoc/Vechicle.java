package onlaibaihoc;

public class Vechicle 
{
    String ten_Chu_Xe;
    String loai_Xe;
    double dung_Tich;
    double tri_Gia;
    double thue_Phai_Nhap;

    public void setTen_Chu_Xe(String ten_Chu_Xe) 
    {
        this.ten_Chu_Xe = ten_Chu_Xe;
    }

    public String getTen_Chu_Xe() 
    {
        return ten_Chu_Xe;
    }

    public void setLoai_Xe(String loai_Xe) 
    {
        this.loai_Xe = loai_Xe;
    }

    public String getLoai_Xe() 
    {
        return loai_Xe;
    }

    public void setDung_Tich(double dung_Tich) 
    {
        this.dung_Tich = dung_Tich;
    }

    public double getDung_Tich() 
    {
        return dung_Tich;
    }

    public void setTri_Gia(double tri_Gia) 
    {
        this.tri_Gia = tri_Gia;
    }

    public double getTri_Gia() 
    {
        return tri_Gia;
    }
    
    public Vechicle()
    {

    }

    public Vechicle(String ten_Chu_Xe, String loai_Xe, double dung_Tich, double tri_Gia)
    {
        this.ten_Chu_Xe = ten_Chu_Xe;
        this.loai_Xe = loai_Xe;
        this.dung_Tich = dung_Tich;
        this.tri_Gia = tri_Gia;
    }

    public double thue_Nhap()
    {
        
        if(this.dung_Tich < 100)
        {
            this.thue_Phai_Nhap = this.getTri_Gia() * 0.1 / 100;
        }
        if(this.dung_Tich >= 100 && this.dung_Tich <= 200)
        {
            this.thue_Phai_Nhap = this.getTri_Gia() * 0.3 / 100;
        }
        else
        {
            this.thue_Phai_Nhap = this.getTri_Gia() * 0.5 / 100;
        }
        

        return this.thue_Phai_Nhap;
    }

    @Override
    public String toString() 
    {
        return "Thue Phai Nhap La: " + this.thue_Nhap();
    }


}
