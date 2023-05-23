package codebancaphe;

import java.util.Date;

public class CaPheLoai1 extends CaPhe{
    public CaPheLoai1(){

    }
    public CaPheLoai1(String nhaSanXuat, double trongLuong, double donGia, Date ngayNhapKho, Date ngayHetHanSuDung){
        super(nhaSanXuat, trongLuong, donGia, ngayNhapKho, ngayHetHanSuDung);
    }

    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "Nha San Xuat: " + this.getNhaSanXuat() + "/" + "Trong Luong: " + this.getTrongLuong()
        + "/" + "Don Gia: " + this.getDonGia() + "/" + "Ngay Nhap Kho: " + this.getNgayNhapKho()
        + "/" + "Ngay Het Han Su Dung: " + this.getNgayHetHanSuDung();
    }
}
