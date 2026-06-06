package JavaBase.IoExample.assets.FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInLab {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/assets/input.txt");
        int data;
        while((data = fis.read()) != -1){
            System.out.println("数字: " + data + " -> 字符: " + (char)data);
        }


        FileInputStream fis_pic = new FileInputStream("src/assets/happy.jpg");
        FileOutputStream fos_pic = new FileOutputStream("src/assets/output/copy_happy.jpg");

        byte[] buffer= new byte[1024];
        int count;

        while((count = fis_pic.read(buffer))!=-1){
            fos_pic.write(buffer,0,count);
        }

        fis_pic.close();
        fos_pic.close();

    }
}
