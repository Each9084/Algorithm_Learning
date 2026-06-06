package JavaBase.IoExample.assets;

import java.io.FileInputStream;

public class FileInputLab {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("src/assets/test.txt")){
            int data;
            while((data = fileInputStream.read())!=-1){
                System.out.println((char)data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
