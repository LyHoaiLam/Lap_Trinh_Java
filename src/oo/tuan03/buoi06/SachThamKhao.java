package oo.tuan03.buoi06;

public class SachThamKhao extends Book05
{
    public double thueVAT = 5;// Thuế Mặc Định

    public SachThamKhao()
    {

    }

    public SachThamKhao(int maSach, String nhaXuatBan, int soLuong, double donGia, String date, double thueVAT)
    {
        super(maSach, nhaXuatBan, soLuong, donGia, date);
        this.thueVAT = thueVAT;
    }

    public double tinhTienCongThueVAT( double thueVAT)
    {
        return super.donGia * super.soLuong + this.thueVAT;
    }

    @Override
    public void Enter_Book_Information() 
    {
        super.Enter_Book_Information();
        System.out.println("Nhap Thue Phai Tra: ");
        this.thueVAT = input.nextDouble();    
    }

    @Override
    public String toString() 
    {
        return super.toString() + " / " + " THUE PHAI TRA: "+ this.thueVAT + " / " + " THANH TIEN: " + this.tinhTienCongThueVAT(thueVAT);
    }
}
