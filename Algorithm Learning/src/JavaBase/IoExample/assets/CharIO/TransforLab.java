package JavaBase.IoExample.assets.CharIO;

import java.io.*;
import java.nio.charset.Charset;

public class TransforLab {
    public static void main(String[] args) throws IOException {
        String str = "午餐肉大侠";
        try (OutputStreamWriter ops = new OutputStreamWriter(
                new FileOutputStream("src/assets/test_utf8.txt"), "gbk")) {

            ops.write(str);
            ops.close();

            FileReader fileReader = new FileReader("src/assets/test_utf8.txt");
            int read;
            while((read = fileReader.read())!=-1){
                System.out.println((char)read);
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
