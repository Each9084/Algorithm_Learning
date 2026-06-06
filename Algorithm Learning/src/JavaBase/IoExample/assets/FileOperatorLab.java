package JavaBase.IoExample.assets;

import java.io.File;
import java.io.IOException;

public class FileOperatorLab {
    public static void main(String[] args) throws IOException {
        File file = new File("src/assets/test2.txt");
        if (file.createNewFile()){
            System.out.println("文件创建成功");
        } else {
            System.out.println("文件已存在");
        }

        File file1 = new File("src/assets/test3.txt");
        if (file.renameTo(file1)){
            System.out.println("文件重命名成功");
        }else {
            System.out.println("文件重命名失败");
        }

        if (file1.delete()){
            System.out.println("文件删除成功");
        }else {
            System.out.println("文件删除失败");
        }


    }
}
