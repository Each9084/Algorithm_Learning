package JavaBase.oopExample.nativeExample;

public class HelloJNI {
    static {
        // 加载名为 libhello.dylib 的动态链接库
        System.loadLibrary("hello");

    }


    private native void helloJNI();

    public static void main(String[] args) {
        new HelloJNI().helloJNI();
    }



}
