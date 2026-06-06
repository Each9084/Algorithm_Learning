package JavaBase.IoExample.assets;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageByteLab {
    public static void main(String[] args) {
        try(FileInputStream fi = new FileInputStream("src/assets/picture.jpg");
            FileOutputStream fo = new FileOutputStream("src/assets/output/copy_picture.jpg")
        ){
            byte[] buffer = new byte[1024];
            int len;

            while((len = fi.read(buffer))!=-1){
                fo.write(buffer,0,len);
            }

            System.out.println("图片拷贝成功！请检查项目根目录下的 copy_cat.jpg");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
