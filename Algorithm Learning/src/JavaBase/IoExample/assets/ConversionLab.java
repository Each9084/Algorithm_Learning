package JavaBase.IoExample.assets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConversionLab {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/assets/test.txt"));
        char[] cha = new char[1024];
        int len = isr.read(cha);
        System.out.println(new String(cha,0,len));
        isr.close();
    }
}
