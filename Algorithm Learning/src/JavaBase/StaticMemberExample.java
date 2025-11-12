package JavaBase;

public class StaticMemberExample {
    // 静态变量 - 属于类
    private static int objectCount = 0;
    private static final String APP_NAME = "我的应用";

    // 静态方法 - 属于类
    public static void showAppInfo() {
        System.out.println("应用名称: " + APP_NAME);
        System.out.println("对象数量: " + objectCount);
    }

    public StaticMemberExample() {
        objectCount++;  // 在构造方法中更新静态变量
    }

    public static void main(String[] args) {
        // ✅ 推荐：通过类名访问静态成员
        System.out.println("初始对象数: " + StaticMemberExample.objectCount);
        StaticMemberExample.showAppInfo();

        // 创建对象
        new StaticMemberExample();
        new StaticMemberExample();

        // 查看更新后的静态变量
        System.out.println("创建对象后: " + StaticMemberExample.objectCount);

        // ⚠️ 允许但不推荐：通过对象访问静态成员
        StaticMemberExample obj = new StaticMemberExample();
        System.out.println("通过对象访问: " + obj.objectCount);     // 不推荐！
        obj.showAppInfo();                                      // 不推荐！

        // 这样写容易让人混淆：objectCount 到底是实例变量还是静态变量？
    }
}