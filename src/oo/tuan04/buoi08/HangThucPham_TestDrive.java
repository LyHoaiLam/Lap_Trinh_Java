package oo.tuan04.buoi08;

import java.util.Date;

public class HangThucPham_TestDrive 
{
    public static void main(String[] args) 
    {
        //HangThucPham hangThucPham = new HangThucPham();
        //System.out.println(hangThucPham);
        // Không chỉnh sửa
        // Có Quyền Truy cập
        // Private Trước sethangHoa để Không Bị Thây Đổi
        //hangThucPham.set("sfbsfs");   
        //System.out.println(hangThucPham); 

        //System.out.println(hangThucPham.getMaHang());// Truy Cập Vào Mã Hàng ( Truy Xuất )

        //HangThucPham hangThucPham2 = new HangThucPham(null);
        //System.out.println(hangThucPham2);

        HangThucPham hangThucPham3 = new HangThucPham("222", "Hoai Lam", 32.0000, new Date(), new Date());
        System.out.println(hangThucPham3);

    }
        
}
