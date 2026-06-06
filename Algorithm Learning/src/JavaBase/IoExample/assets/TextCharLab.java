package JavaBase.IoExample.assets;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCharLab {
    public static void main(String[] args) {
        try(
                //FileReader：打开通往 test.txt 的“读信通道”。
                FileReader fr = new FileReader("src/assets/test.txt");
                //FileWriter：打开通往 copy_test.txt 的“写信通道”。如果这个文件不存在，它会自动帮你创建一个。
        FileWriter fw = new FileWriter("src/assets/output/copy_test.txt")){
        int data;

        while((data = fr.read())!=-1){
            System.out.print((char)data);
            fw.write(data);
        }
            System.out.println("\n文本复制成功！检查 copy_test.txt，中文依然完美。");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
