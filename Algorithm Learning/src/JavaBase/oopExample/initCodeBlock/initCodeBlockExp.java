package JavaBase.oopExample.initCodeBlock;

public class initCodeBlockExp {
    public static int staticVar = 1;
    public int instanceVar = 2;

    static {
        System.out.println("执行静态初始化块");
        staticVar = 3;
    }

    {
        System.out.println("执行实例初始化块");
        instanceVar = 4;
    }

    public initCodeBlockExp() {
        System.out.println("执行构造方法");
    }

    public static void main(String[] args) {
        System.out.println("执行main方法");

        initCodeBlockExp e1 = new initCodeBlockExp();
        initCodeBlockExp e2 = new initCodeBlockExp();

        System.out.println("e1的静态变量：" + e1.staticVar);
        System.out.println("e1的实例变量：" + e1.instanceVar);
        System.out.println("e2的静态变量：" + e2.staticVar);
        System.out.println("e2的实例变量：" + e2.instanceVar);
    }






}
