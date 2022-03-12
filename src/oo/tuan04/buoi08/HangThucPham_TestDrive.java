package oo.tuan04.buoi08;

import java.util.Date;

public class HangThucPham_TestDrive 
{
    public static void main(String[] args) 
    {
        //HangThucPham hangThucPham = new HangThucPham();
        //System.out.println(hangThucPham);
        // Không chỉnh sửa maHang
        // Có Quyền Truy cập maHang
        // Private Trước sethangHoa để Không Bị Thây Đổi
        // hangThucPham.set();   setMaHang đang để private nên không truy cập được
        //System.out.println(hangThucPham); 

        //System.out.println(hangThucPham.getMaHang());// Truy Cập Vào Mã Hàng ( Truy Xuất )

        //HangThucPham hangThucPham2 = new HangThucPham(null);
        //System.out.println(hangThucPham2);
        //System.out.println("*******************************************************************************************************************************");

        HangThucPham hangThucPham3 = new HangThucPham("Hoai Lam", "Hoai Lam", 32.0000, new Date(), new Date());
        System.out.println(hangThucPham3);


    }
        
}
