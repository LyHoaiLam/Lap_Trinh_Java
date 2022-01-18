package student02;

public class Student02 
{
    String name;
    String gioiTinh;
    int tuoi;
    String khoa;
    double diemTB;
    Student02()
    {

    }
    
    Student02(String n, String gt, int t, String k, double d)
    {
        this.name = n;
        this.gioiTinh = gt;
        this.tuoi = t;
        this.khoa = k;
        this.diemTB = d;
    }

    void show()
    {
        System.out.println("Name: "+ name);
        System.out.println("Gioi Tinh: "+ gioiTinh);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Khoa: "+ khoa);
        System.out.println("Diem Trung Binh: "+ diemTB);
        System.out.println();
    }
}
