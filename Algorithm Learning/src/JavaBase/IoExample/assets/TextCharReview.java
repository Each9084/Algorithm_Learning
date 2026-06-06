package JavaBase.IoExample.assets;

import java.io.FileReader;
import java.io.FileWriter;

public class TextCharReview {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/assets/test.txt");
            FileWriter fw = new FileWriter("src/assets/output/test_0410")
        ){
            int data;
            while((data = fr.read())!=-1){
                System.out.print((char)data);
                fw.write(data);
            }
            System.out.print("\n文本复制成功！检查 copy_test.txt，中文依然完美。");

        }catch(Exception e){
                e.printStackTrace();
        }
    }
}
