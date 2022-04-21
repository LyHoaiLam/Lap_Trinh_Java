package kiemtracuoiky;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class QuanLyHangHoa_TestDrive 
{
    public static void main(String[] args) 
    {
        DanhSachQuanLyHangHoa danhSach_QLHH = new DanhSachQuanLyHangHoa();

        QuanLyHangHoa quanLyHangHoa01 = new SanhSu("SS001", "Chen Hoa Tiet Bong Hong", 6, 32000, new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa02 = new  DienMay("DM002", "May Giat Toshiba", 2, 720000, 3.5, 12);
        QuanLyHangHoa quanLyHangHoa03 = new  DienMay("DM03", "Tu Lanh DaiKin", 36, 450000, 5.3, 2);
        QuanLyHangHoa quanLyHangHoa04 = new ThucPham("TP06", "Bo Da Lat", 80, 13000, "Hiep Hoi Nong San Da Lat", new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa05 = new DienMay("DM056", "Quat May SenKo", 4, 125000, 2.2, 12);
        QuanLyHangHoa quanLyHangHoa06 = new ThucPham("TP006", "Dua Hau Long An", 8000, 22000, "Tinh Long AN", new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa07 = new SanhSu("SS012", "Chen Vang Nhat Ban", 52, 63000, new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa08 = new DienMay("DM0577", "Quat May Cangagu", 4, 125000, 2.2, 12);
        QuanLyHangHoa quanLyHangHoa09 = new ThucPham("TP065", "Khoai Lang Nhat", 25, 45200, "Nhat Ban", new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa10 = new ThucPham("TP066", "Khoai Tay", 25, 45200, "Mien Tay", new Date(), new Date());

        
        // Dữ Liệu Có Sẵn Trong Danh Sách
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa01);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa02);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa03);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa04);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa05);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa06);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa07);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa08);
        
        int chon_Chuc_Nang;

        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("**************************************MENU CHUC NANG QUAN LY HANG HOA SIEU THI**********************************");
            System.out.println("*                         [1.] THEM HANG HOA VAO DANH SACH                                                    *");
            System.out.println("*                         [2.] SUA HANG HOA TRONG DANH SACH                                                   *");
            System.out.println("*                         [3.] XOA HANG HOA TRONG DANH SACH                                                   *");
            System.out.println("*                         [4.] TIM HANG HOA THEO MA HANG HOA                                                  *");
            System.out.println("*                         [5.] IN RA DANH SACH TAT CA HANG HOA TRONG DANH SACH                                *");
            System.out.println("*                              Chon Chuc Nang Can Su Dung:                                                    *");
            System.out.println("***************************************************************************************************************");
            chon_Chuc_Nang = scanner.nextInt();

            switch(chon_Chuc_Nang)
            {
                case 1: // Them Hang Hoa Vao Danh Sach
                {
                    do
                    {
                        
                            QuanLyHangHoa quanLyHangHoa =  new QuanLyHangHoa() 
                            {
                                
                            };
                                         
                            quanLyHangHoa.NhapHangHoa();

                            System.out.println("Them Hang Hoa Trong Danh Sach");
                            danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa);

                            System.out.println("Bam Phim [1] De Nhap Them San Pham Vao Danh Sach: ");
                            System.out.println("Bam Phim [2] De Thoat Ra Chuc Nang Nhap Them San Pham Vao Danh Sach");
                            System.out.println("Chon: ");
                            chon_Chuc_Nang = scanner.nextInt();

                    }while(chon_Chuc_Nang == 1 );
                    
                }break;

                case 2: // Sua Hang Hoa Trong Danh Sach
                {
                    System.out.println("Sua Hang Hoa Trong Danh Sach");
                }break;

                case 3: // Xoa Hang Hoa Trong Danh Sach
                {
                    System.out.println("Xoa Hang Hoa Trong Danh Sach");
                }break;

                case 4: // Tim Hang Hoa Trong Danh Sach ( Theo Ma Hang Hoa )
                {
                    System.out.println("Tim Hang Hoa Theo Ma Hang Hoa");
                }break;

                case 5: // In Ra Danh Sach Tat Ca Cac Hang Hoa Co Trong Danh Sach
                {
                    System.out.println("In Ra Danh Sach Tat Ca Cac Hang Hoa Co Trong Danh Sach");
                    danhSach_QLHH.Print_Information_QuanLyHangHoa();
                }break;

                default:
                System.out.println("Chon Sai!!!!!!!!!!!!!");
            }
            
        

        
        }while(chon_Chuc_Nang >= 0 && chon_Chuc_Nang <= 5);

    }

}




      





