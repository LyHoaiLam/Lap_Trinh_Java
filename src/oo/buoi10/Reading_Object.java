package oo.buoi10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import oo.buoi08.HangThucPham;

public class Reading_Object 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        //11
        FileInputStream fileInputStream = new FileInputStream("data.lam");

        //2
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        //3 Read Object Stream
        HangThucPham hangThucPham = (HangThucPham)objectInputStream.readObject();
        HangThucPham hangThucPham2 = (HangThucPham) objectInputStream.readObject();
        List<HangThucPham> list = (List) objectInputStream.readObject();

        for (HangThucPham hangThucPham3 : list) 
        {   
            if(hangThucPham.getTenHang().trim().equals("Mi Hao Hao"))
            {
                System.out.println(hangThucPham);
            }
        }

        objectInputStream.close();
   
        /*list.add(hangThucPham);
        list.add(hangThucPham2);
        System.out.println(hangThucPham);
        System.out.println(hangThucPham2);
        objectInputStream.close();*/

        // Code Voi Abstract
        




    }    
}
