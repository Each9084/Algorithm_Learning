package JavaBase.IoExample.assets.FileStream;

import java.io.File;

public class FileConstructorLab {
    public static void main(String[] args) {
        String path = "src/assets/test.txt";
        File file1 =new File(path);

        String path2 = "src/assets/test2.txt";
        File file2 = new File(path2);

        String parent = "src/assets/output";
        String child = "bbb.txt";
        File file3 = new File(parent,child);


        System.out.println("文件绝对路径:"+file1.getAbsolutePath());
        System.out.println("文件构造路径:"+file1.getPath());
        System.out.println("文件名称:"+file1.getName());
        System.out.println("文件长度:"+file1.length());

        File file4 = new File("src/assets/output");
        System.out.println("目录绝对路径:"+file4.getAbsolutePath());
        System.out.println("目录构造路径:"+file4.getPath());
        System.out.println("目录名称:"+file4.getName());
        System.out.println("目录长度:"+file4.length());
    }
}
