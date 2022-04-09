package oo.tuan06.buoi12;

public class Dog12 
{
    //thuoc tinh
    private int size;

    //khoi static
    static
    {
        System.out.println("Khoi tao du lieu ....");
    }

    private static int count;//khong phai thanh vien object => thanh vien class=> khong tro thanh trang htai object trong Heap

    /**
     * @return the count
     */
    public static int getCount() 
    {//method class=> khong tro thanh hanh vi cuar object
        //size = 0;//
        //thanh vien class khong duoc truy cap vao thanh vie object
        return count;
    }

    //method
    public void bark()
    {
        System.out.println("Sua...");
    }

    public Dog12()
    {
        count++;//thanh vien object co the truy cap vao thanh vien class
        // Nếu Method Này Được tạo mấy Lần Thì count Sẽ Tăng Lên Mấy Lần ( Nếu Có 2 Đối Tượng Dog12 Đc Tạo ( Hàm Main ) Thì count++ Tăng Lên Bằng 2 )
    }    
}
