package JavaBase.IoExample.assets.CharIO;

import java.io.FileInputStream;
import java.io.IOException;

public class ZhLab {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("src/assets/test.txt");

        int len;
        while((len=inputStream.read())!=-1){
            System.out.print((char)len);
        }


        try(FileInputStream fis = new FileInputStream("src/assets/test.txt")){
            byte[] bytes = new byte[1024];
            int length;
            while((length = fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,length));
            }
        }
    }
}
