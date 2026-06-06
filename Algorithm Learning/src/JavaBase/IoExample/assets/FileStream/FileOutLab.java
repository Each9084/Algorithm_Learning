package JavaBase.IoExample.assets.FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutLab {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/assets/fos.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();

        try(FileOutputStream fos1 = new FileOutputStream("src/assets/example1.txt")){
            fos1.write(120);
            fos1.write('X');
            fos1.write(0x12345678);
        }catch (Exception e){
            e.printStackTrace();
        }

        FileOutputStream fos2 = new FileOutputStream("src/assets/example1.txt",true);
        byte[] b = "午餐肉艺术家".getBytes();
        fos2.write(b);
        fos2.close();


        try(FileInputStream fis  = new FileInputStream("src/assets/example1.txt")){

            byte[] buffer = new byte[1024];
            int len;

            while ((len = fis.read(buffer))!=-1){
                System.out.println(new String(buffer,0,len));
            }

        }catch (Exception e){
            e.printStackTrace();
        }



        FileOutputStream fos3 = new FileOutputStream("src/assets/example1.txt",true);
        byte[] c = "abcde".getBytes();
        fos3.write(c,2,2);
        fos3.close();


    }
}
