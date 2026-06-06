package JavaBase.IoExample.assets;

import java.io.*;

public class SerializationLab {
    public static void main(String[] args) throws FileNotFoundException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.obj"))) {
            SerializationUser user  = new SerializationUser("午餐肉大侠",18,"123456");
            oos.writeObject(user);
            System.out.println("对象已保存到硬盘！");
        } catch (IOException e) {
           e.printStackTrace();
        }



        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.obj"))) {
            SerializationUser user = (SerializationUser) ois.readObject();
            System.out.println("读取到的对象：" + user);
        } catch (IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
