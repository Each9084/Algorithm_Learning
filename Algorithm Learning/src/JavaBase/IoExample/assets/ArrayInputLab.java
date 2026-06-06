package JavaBase.IoExample.assets;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ArrayInputLab {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(new ByteArrayInputStream("午餐肉大侠".getBytes(StandardCharsets.UTF_8)));
        byte[] flush = new byte[1024];
        int len = 0;
        while((len = is.read(flush))!=-1){
            System.out.println(new String(flush,0,len));
        }
        is.close();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] info = "午餐肉大侠".getBytes();

        bos.write(info,0,info.length);

        byte[] dest = bos.toByteArray();
        bos.close();


    }
}
