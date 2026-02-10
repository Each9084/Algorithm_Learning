package JavaBase.oopExample.Annotation;


import java.lang.annotation.*;

// 1. 告诉 JVM：这个注解要保留到“运行期”，这样我们才能用代码读到它
@Retention(RetentionPolicy.RUNTIME)
// 2. 告诉 JVM：这个注解只能贴在“方法”上面
@Target(ElementType.METHOD)
public @interface LogTime {
    // 这是一个特殊的标签，不需要写成员变量
}
