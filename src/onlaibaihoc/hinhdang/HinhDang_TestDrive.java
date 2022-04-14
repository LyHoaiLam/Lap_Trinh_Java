package onlaibaihoc.hinhdang;

public class HinhDang_TestDrive 
{
    public static void main(String[] args) 
    {
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.setSound_File("hinhvuong.aif");
        hinhVuong.Rotate();

        System.out.println();

        HinhTron hinhTron = new HinhTron();
        hinhTron.setSound_File("hinhtron.mp4");
        hinhTron.Rotate();

        System.out.println();

        AmoeBa_OnLai amoeBa_OnLai = new AmoeBa_OnLai();
        amoeBa_OnLai.setX(5);
        amoeBa_OnLai.setY(20);
        amoeBa_OnLai.setSound_File("Amoeba.mp2");
        amoeBa_OnLai.Rotate();
    }    
}
