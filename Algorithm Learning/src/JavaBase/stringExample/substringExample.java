package JavaBase.stringExample;

public class substringExample {
    public static void main(String[] args) {
        String str = "   Hello,   world!  ";
        String trimmed = str.trim();                  // 去除字符串开头和结尾的空格
        String[] words = trimmed.split("\\s+");
        for (String element:words
             ) {
            System.out.println(element);
        }

        String num = String.valueOf(123);
        Integer number = 123;
        System.out.println(number.toString());


        // 将字符串按照空格分隔成单词数组
        String firstWord = words[0].substring(0, 1);  // 提取第一个单词的首字母
        System.out.println(firstWord);                // 输出 "H"
    }
}
