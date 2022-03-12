package oo.tuan03.buoi06;


public class SachGiaoKhoa extends Book05
{
        private boolean tinhTrang;

        public SachGiaoKhoa()
        {

        }

        public SachGiaoKhoa(int maSach, String nhaXuatBan, int soLuong, double donGia, String date, boolean tinhTrang)
        {
            super(maSach, nhaXuatBan, soLuong, donGia, date);
            this.tinhTrang = tinhTrang;
        }

        public double tinhTienTheoTinhTrangSach(boolean tinhTrang)
        {
            if(tinhTrang ==  true)
            {
                return super.soLuong * super.donGia;
            }
            else
            {
                return super.soLuong * this.donGia * 0.5;
            }
        }

        @Override
        public void Enter_Book_Information() 
        {
            super.Enter_Book_Information();
            System.out.println("Tinh Trang Sach ( Moi Thi La True /  Sai Thi La False ): ");
            tinhTrang = input.nextBoolean();
        }

        @Override
        public String toString() 
        {
            return super.toString() + " / " + " Tinh Trang Sach ( Tru/False ): "+ this.tinhTrang +
             " / " + " Thanh Tien: " + this.tinhTienTheoTinhTrangSach(tinhTrang);
        }
}
