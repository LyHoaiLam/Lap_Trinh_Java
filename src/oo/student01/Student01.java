package oo.student01;

public class Student01 
{
    String name;
    String gioiTinh;
    int tuoi;
    String khoa;
    double diemTB;
    Student01(/*this ẩn (không nhìn thấy được)*/)// Hàm tạo không tham số
    {

    }

    public Student01(/*this ẩn (không nhìn thấy được)*/String name, String gioiTinh)// Constructor 2 tham số
    {
        this.name = name;// This dùng để phân biệt biến toàn cục và biến cục bộ nếu tên của biến toàn cục và cục bộ giống nhau
        this.gioiTinh = gioiTinh;
    }
    
    public Student01(String name, String gt, int t, String k, double d)// Constructor 5 tham số
    {
        this(name, gt);// Có thể đem Constructor 2 tham số vào trong Constructor 5 tham số bằng this
        // Phải đặt đầu tiên còn không nếu không đặt đầu tiên thì sẽ bị lỗi

        //this.name = n;
        //this.gioiTinh = gt;
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
