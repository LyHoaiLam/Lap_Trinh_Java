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

    public Student02(String name, String gt)// Ham tạo 2 tham số
    {
        this.name = name;
        this.gioiTinh = gt;
    }
    
    public Student02(String name, String gt, int t, String k, double d)// Hàm tạo 5 tham số
    {
        this(name, gt);// Có thể đem hàm tạo 2 tham số vào trong hàm tạo 5 tham số bằng this
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
