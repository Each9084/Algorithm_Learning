package JavaBase.oopExample.Annotation;


import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws Exception{
        MyService service = new MyService();

        // 获取 MyService 类中所有的方法
        Method[] methods = MyService.class.getDeclaredMethods();

        for (Method method : methods
        ) {
            if (method.isAnnotationPresent(LogTime.class)){
                // 关键逻辑：检查这个方法上有没有贴 @LogTime 标签
                System.out.println("发现带 @LogTime 的方法：" + method.getName() + "，开始计时...");
                long start = System.currentTimeMillis();

                // 正式执行
                method.invoke(service);

                long end = System.currentTimeMillis();
                System.out.println("方法 [" + method.getName() + "] 执行结束，耗时：" + (end - start) + "ms\n");

            }else{
                // 没贴标签，正常执行
                method.invoke(service);
                System.out.println("方法 [" + method.getName() + "] 无需计时。\n");
            }

        }
    }
}
