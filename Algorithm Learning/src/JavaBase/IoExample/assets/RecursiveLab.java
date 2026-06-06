package JavaBase.IoExample.assets;

import java.io.File;

public class RecursiveLab {
    public static void main(String[] args) {
        File directory = new File("F:\\IntelliJ IDEA\\CodeSource\\Algorithm _Learning\\Algorithm Learning\\src");
        traverseDirectory(directory);
    }

    public static void traverseDirectory(File directory){
        File[] fileAndDirs = directory.listFiles();

        for (File fileOrDir : fileAndDirs){
            if (fileOrDir.isFile()){
                System.out.println("文件：" + fileOrDir.getName());
            }else if (fileOrDir.isDirectory()){
                System.out.println("文件夹" + fileOrDir.getName());
                traverseDirectory(fileOrDir);
            }
        }
    }



}
