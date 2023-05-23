package codebancaphe;

import java.util.Date;

public abstract class CaPhe {
    private String nhaSanXuat;
    private double trongLuong;
    private double donGia;
    private Date ngayNhapKho;
    private Date ngayHetHanSuDung;

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }
    public double getTrongLuong() {
        return trongLuong;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayHetHanSuDung(Date ngayHetHanSuDung) {
        this.ngayHetHanSuDung = ngayHetHanSuDung;
    }
    public Date getNgayHetHanSuDung() {
        return ngayHetHanSuDung;
    }
    public CaPhe(){  
    }

    public CaPhe(String nhaSanXuat, double trongLuong, double donGia, Date ngayNhapKho, Date ngayHetHanSuDung){
        this.setNhaSanXuat(nhaSanXuat);
        this.setTrongLuong(trongLuong);
        this.setDonGia(donGia);
        this.setNgayNhapKho(ngayNhapKho);
        this.setNgayHetHanSuDung(ngayHetHanSuDung);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "Nha San Xuat: " + this.getNhaSanXuat() + "/" + "Trong Luong: " + this.getTrongLuong()
        + "/" + "Don Gia: " + this.getDonGia() + "/" + "Ngay Nhap Kho: " + this.getNgayNhapKho()
        + "/" + "Ngay Het Han Su Dung: " + this.getNgayHetHanSuDung();
    }
    
}

