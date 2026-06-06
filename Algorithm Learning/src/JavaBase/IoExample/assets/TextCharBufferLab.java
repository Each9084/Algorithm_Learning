package JavaBase.IoExample.assets;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCharBufferLab {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/assets/test.txt");
             FileWriter fw = new FileWriter("src/assets/output/test_buffer.txt")) {

            char[] buffer = new char[1024];
            int len;
            while ((len = fr.read(buffer))!=-1){
                fw.write(buffer,0,len);
            }
            System.out.println("使用 BufferedReader 复制成功！速度提升了 N 倍。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
