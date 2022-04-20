package onlaibaihoc.animal;

public class Hero01 extends NhanVat_HanhDong implements CanFight01, CanSwim01, CanFly01
{

    @Override
    public void Bay() {
        // TODO Auto-generated method stub
        System.out.println("Bay Tren Bau Troi");
    }

    @Override
    public void BoiLoi() {
        // TODO Auto-generated method stub
        System.out.println("Boi Loi Duoi Nuoc");
        
    }

    @Override
    public void DanhNhau() {
        // TODO Auto-generated method stub
        System.out.println("Danh Nhau vs Quay Vat");
        
    }

    @Override
    void QuanhNhau() {
        // TODO Auto-generated method stub
        System.out.println("Quanh Nhau Abstract NhanVat_HanhDong");
        
    }

    public static void main(String[] args) 
    {
        Hero01 hero01 = new Hero01();
        hero01.Bay();
        hero01.BoiLoi();
        hero01.DanhNhau();
        hero01.QuanhNhau();    
    }
    
}
