package JavaBase.oopExample.Annotation;

public class MyService {

    @LogTime // 我们想测量这个方法的耗时
    public void hardWork() throws InterruptedException{
        System.out.println("正在进行复杂的运算...");
        Thread.sleep(1500);
    }


    public void lazyWork(){
        System.out.println("我没打标签，我很快。");
    }
}
