package JavaBase.IoExample.assets;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessLab {
    public static void main(String[] args) {

        try(RandomAccessFile raf = new RandomAccessFile("src/assets/test2.txt","rw")){
            raf.writeUTF("new content");

            long pos = raf.getFilePointer();
            System.out.println("now location:"+pos);

            raf.seek(6);
            raf.write('X');

            raf.seek(raf.length());
            raf.writeBytes("!!Appending!!");




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
