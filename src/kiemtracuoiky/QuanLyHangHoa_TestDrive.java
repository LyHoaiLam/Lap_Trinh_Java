package kiemtracuoiky;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;




public class QuanLyHangHoa_TestDrive 
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
    {
        DanhSachQuanLyHangHoa danhSach_QLHH = new DanhSachQuanLyHangHoa();

        QuanLyHangHoa quanLyHangHoa00 = new SanhSu("SS001", "Chen Hoa Tiet Bong Hong", 6, 32000, new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa01 = new  DienMay("DM002", "May Giat Toshiba", 2, 720000, 3.5, 12);
        QuanLyHangHoa quanLyHangHoa02 = new  DienMay("DM03", "Tu Lanh DaiKin", 36, 450000, 5.3, 2);
        QuanLyHangHoa quanLyHangHoa03 = new ThucPham("TP06", "Bo Da Lat", 80, 13000, "Hiep Hoi Nong San Da Lat", new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa04 = new DienMay("DM056", "Quat May SenKo", 4, 125000, 2.2, 12);
        QuanLyHangHoa quanLyHangHoa05 = new ThucPham("TP006", "Dua Hau Long An", 8000, 22000, "Tinh Long AN", new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa06 = new SanhSu("SS012", "Chen Vang Nhat Ban", 52, 63000, new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa07 = new DienMay("DM0577", "Quat May Cangagu", 4, 125000, 2.2, 12);
        QuanLyHangHoa quanLyHangHoa08 = new ThucPham("TP065", "Khoai Lang Nhat", 25, 45200, "Nhat Ban", new Date(), new Date());
        QuanLyHangHoa quanLyHangHoa09 = new ThucPham("TP0666", "Khoai Tay", 25, 45200, "Mien Tay", new Date(), new Date());
        
        // Dữ Liệu Có Sẵn Trong Danh Sách
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa00);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa01);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa02);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa03);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa04);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa05);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa06);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa07);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa08);
        danhSach_QLHH.Add_QuanLyHangHoa(quanLyHangHoa09);

        /*FileOutputStream outputStream = new FileOutputStream("quanlyhangha.com");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        DanhSachQuanLyHangHoa danhSachQuanLyHangHoa22 = new DanhSachQuanLyHangHoa();
        danhSachQuanLyHangHoa22.Add_QuanLyHangHoa(quanLyHangHoa00);
        danhSachQuanLyHangHoa22.Add_QuanLyHangHoa(quanLyHangHoa01);
        danhSachQuanLyHangHoa22.Add_QuanLyHangHoa(quanLyHangHoa02);
        danhSachQuanLyHangHoa22.Add_QuanLyHangHoa(quanLyHangHoa03);
        danhSachQuanLyHangHoa22.Add_QuanLyHangHoa(quanLyHangHoa04);
        danhSachQuanLyHangHoa22.Add_QuanLyHangHoa(quanLyHangHoa05);
        danhSachQuanLyHangHoa22.Add_QuanLyHangHoa(quanLyHangHoa07);
        danhSachQuanLyHangHoa22.Add_QuanLyHangHoa(quanLyHangHoa08);
        danhSachQuanLyHangHoa22.Add_QuanLyHangHoa(quanLyHangHoa09);
        
        objectOutputStream.close();

        FileInputStream fileInputStream2 = new FileInputStream("quanlyhanghoa.com");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);*/


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
            System.out.println("*                         [6.] THOAT RA KHOI CHUONG TRINH                                                     *");
            System.out.println("*                              Chon Chuc Nang Can Su Dung:                                                    *");
            System.out.println("***************************************************************************************************************");
            chon_Chuc_Nang = scanner.nextInt();
            scanner.nextLine();
            
            switch(chon_Chuc_Nang)
            {
                case 1: // Them Hang Hoa Vao Danh Sach
                {
                    do
                    {    
                            System.out.println("Them Hang Hoa Trong Danh Sach");

                            danhSach_QLHH.Add_QuanLyHangHoa(danhSach_QLHH.NhapHangHoa());

                            System.out.println("Bam Phim [1] De Tiep Tuc Nhap Them San Pham Vao Danh Sach: ");
                            System.out.println("Bam Phim [2] De Thoat Ra Chuc Nang Nhap Them San Pham Vao Danh Sach");
                            System.out.println("Chon: ");
                            chon_Chuc_Nang = scanner.nextInt();

                    }while(chon_Chuc_Nang == 1 );
                    
                }break;

                case 2: // Sua Hang Hoa Trong Danh Sach 
                {
                    
                    System.out.println("Sua Hang Hoa Trong Danh Sach");
                    System.out.println("Nhap Vi Tri Can Sua ( Xoa Theo Vi Tri Trong Danh Sach )): ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap Thong Tin Sua: ");
                    danhSach_QLHH.Update_QuanLyHangHoa(index, danhSach_QLHH.NhapHangHoa() );
                    
                }break;

                case 3: // Xoa Hang Hoa Trong Danh Sach
                {

                    System.out.println("Xoa Hang Hoa Trong Danh Sach");
                    System.out.println("Vi Tri Can Xoa ( Vi Tri Trong Danh Sach ): ");
                    int index = scanner.nextInt();
                    danhSach_QLHH.ReMoVe_QuanLyHangHoa(index);
                    System.out.println("Xoa Thanh Cong");

                }break;

                case 4: // Tim Hang Hoa Trong Danh Sach ( Theo Ma Hang Hoa )
                {
                    System.out.println("Tim Hang Hoa Theo Ma Hang Hoa");
                    System.out.println("Nhap Ma Hang Hoa Can Tim: ");
                    String ma_Hang_Hoa = scanner.nextLine();
                    danhSach_QLHH.tim_Hang_Hoa(ma_Hang_Hoa);
                    // System.out.println(danhSach_QLHH.tim_Hang_Hoa(ma_Hang_Hoa));

                    
                }break;

                case 5: // In Ra Danh Sach Tat Ca Cac Hang Hoa Co Trong Danh Sach
                {
                    danhSach_QLHH.Print_Information_QuanLyHangHoa();

                }break;

                case 6:
                {
                    break;
                }

                default:
                System.out.println("Chon Sai!!!!!!!!!!!!!");
            }
            
        
        }while(chon_Chuc_Nang >= 0 && chon_Chuc_Nang <= 5);

    }

}




      





