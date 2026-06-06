package JavaBase.IoExample.assets.FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileControlLab {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src/assets/example.txt";
        //FileOutputStream fos = new FileOutputStream(fileName);
        File file  =new File("src/assets/example.txt");
        //FileOutputStream fos = new FileOutputStream(file);

        try(FileOutputStream fos = new FileOutputStream(file,true)){
            fos.write("这次是鱼丸大侠".getBytes());
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
