package codebancaphe;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BanCaPhe {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Nhap Su Lua Chon Cua Ban: ");

        int luaChon = scanner.nextInt();
        scanner.nextLine();
        if(luaChon == 1){
            CaPhe caPheLoai1 = new CaPheLoai1();

            System.out.println("Nhap Ten Nha San Xuat: ");
            String nhaSanXuat = scanner.nextLine();
            caPheLoai1.setNhaSanXuat(nhaSanXuat);

            System.out.println("Nhap Trong Luong: ");
            double trongLuong = scanner.nextDouble();
            caPheLoai1.setTrongLuong(trongLuong);

            System.out.println("Nhap Don Gia: ");
            double donGia = scanner.nextDouble();
            caPheLoai1.setDonGia(donGia);
           
            System.out.println("Nhap Ngay Nhap Kho: ");
            scanner.nextLine();
            String sDate = scanner.nextLine();
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
            caPheLoai1.setNgayNhapKho(date);

            System.out.println("Nhap Het Han: ");
            String Dates = scanner.nextLine();
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(Dates);
            caPheLoai1.setNgayHetHanSuDung(date2);
            
            System.out.println(caPheLoai1.toString());
        }else{
            CaPhe caPheLoai2 = new CaPheLoai2();
        }

    }
}
