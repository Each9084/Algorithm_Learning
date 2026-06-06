package JavaBase.IoExample.assets.CharIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WholeLab {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/assets/flush_test.txt");
        fw.write("午饭肉大侠");

        fw.flush();
        fw.write(" 艺术家");
        fw.close();


        String path = "src/assets/flush_test2.txt";

        System.out.println("--- FW2 开始了, 准备创建 ---");
        FileWriter fw2 = new FileWriter(path);
        printFile(path, "创建后");

        System.out.println("\n--- 执行 fw2.write(\"刷\") ---");
        fw2.write("刷");
        printFile(path, "write('刷') 后");

        System.out.println("\n--- 执行 fw2.flush() ---");
        fw2.flush();
        printFile(path, "第一次 flush 后");

        System.out.println("\n--- 执行 fw2.write(\"新\") ---");
        fw2.write("新");
        printFile(path, "write('新') 后");

        System.out.println("\n--- 执行 fw2.flush() ---");
        fw2.flush();
        printFile(path, "第二次 flush 后");

        System.out.println("\n--- 执行 fw2.write(\"关\") ---");
        fw2.write("关");
        printFile(path, "write('关') 后");

        System.out.println("\n--- 执行 fw2.close() ---");
        fw2.close();
        printFile(path, "close 后");

        try {
            System.out.println("\n--- 尝试在关闭后执行 fw2.write(\"闭\") ---");
            fw2.write("闭");
        } catch (IOException e) {
            System.out.println("❌ 报错了: " + e.getMessage());
        }




    }

    // 辅助方法：快速读取并打印文件内容
    private static void printFile(String path, String stage) {
        try {
            String content = Files.readString(Paths.get(path));
            System.out.println("[" + stage + "] 文件内容是: \"" + content + "\"");
        } catch (IOException e) {
            System.out.println("[" + stage + "] 文件还不存在或无法读取");
        }
    }
}
