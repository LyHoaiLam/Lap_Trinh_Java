package oo.buoi10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oo.buoi08.HangThucPham;

public class Writing_Object 
{
    public static void main(String[] args) throws IOException 
    {
        //1
        FileOutputStream outputStream = new FileOutputStream("hoailam3999.lam");

        //2
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        //HangThucPham
        HangThucPham hangThucPham = new HangThucPham("556", "Mi Hao Hao", 23000, new Date(), new Date());

        HangThucPham hangThucPham2 = new HangThucPham("555", "KoKoMi", 64000, new Date(), new Date());

        List<HangThucPham> list = new  ArrayList<>();
        list.add(hangThucPham);
        list.add(hangThucPham2);

        objectOutputStream.writeObject(hangThucPham);
        objectOutputStream.writeObject(hangThucPham2);

        System.out.println(hangThucPham);
        System.out.println(hangThucPham2);

        objectOutputStream.close();


    }    
}
