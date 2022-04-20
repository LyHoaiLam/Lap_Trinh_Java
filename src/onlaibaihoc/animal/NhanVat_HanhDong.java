package onlaibaihoc.animal;

public abstract class NhanVat_HanhDong 
{
    private String ten;
   private  int tuoi;
    
    public NhanVat_HanhDong()
    {

    }

    public void ThongTin()
    {
        System.out.println("Hoai Lam");
        System.out.println("Tuoi 19");
    }

    abstract void QuanhNhau();
}
