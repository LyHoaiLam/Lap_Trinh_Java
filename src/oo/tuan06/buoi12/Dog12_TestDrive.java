package oo.tuan06.buoi12;
import java.util.Scanner;
import static java.lang.System.*;// Thư Viện Giúp Bỏ Từ "System" Ra Các Câu Lệnh Mà Vẫn Bình Thường
// Ex: Thay Vì "System.out.println" Thì Chỉ Cần "out.println" 2 Câu Lệnh Này Tương Đương Nhau

public class Dog12_TestDrive 
{
    public static void main(String[] args) {
        out.println("So LUong cho: " + Dog12.getCount());
        Dog12 dog = new Dog12();
        Dog12 dog2 = new Dog12();
        System.out.println("So LUong cho: " + Dog12.getCount());// Đối Tượng Dog12 Được Tạo 2 Lần Nên Số Lượng Dog12 Sẽ là 2
        // Được Đếm Thông Qua Biến count Bên Class Dog12 ( static count ). Trong Method Mặc Định Dog(){}; Bên Class Dog12

        Math.pow(3, 3);

    }    
}
