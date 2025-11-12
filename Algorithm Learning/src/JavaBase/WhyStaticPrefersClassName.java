package JavaBase;

public class WhyStaticPrefersClassName {
    private static String companyName = "ABC公司";
    private String employeeName;

    public WhyStaticPrefersClassName(String name) {
        this.employeeName = name;
    }

    public static void changeCompany(String newName) {
        companyName = newName;  // 静态方法修改静态变量
    }

    public void showInfo() {
        System.out.println("公司: " + companyName + ", 员工: " + employeeName);
    }

    public static void main(String[] args) {
        // ✅ 清晰明确：通过类名访问静态成员
        System.out.println("公司名称: " + WhyStaticPrefersClassName.companyName);
        WhyStaticPrefersClassName.changeCompany("XYZ集团");

        WhyStaticPrefersClassName emp1 = new WhyStaticPrefersClassName("张三");
        WhyStaticPrefersClassName emp2 = new WhyStaticPrefersClassName("李四");

        emp1.showInfo();
        emp2.showInfo();

        // ⚠️ 混淆：通过对象访问静态成员
        System.out.println("通过emp1访问: " + emp1.companyName);  // 看起来像实例变量！
        emp1.changeCompany("新公司");// 看起来像实例方法！
        emp1.showInfo();
        emp2.showInfo();

        // 这样写会让阅读代码的人困惑：
        // - companyName 是每个员工独有的吗？
        // - changeCompany() 只影响 emp1 还是影响所有员工？
    }
}