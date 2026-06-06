package JavaBase.IoExample.assets;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputLab {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("src/assets/test.txt"));

        byte b = dis.readByte();
        System.out.println(b);

        char c = dis.readChar();
        System.out.println(c);
    }
}
