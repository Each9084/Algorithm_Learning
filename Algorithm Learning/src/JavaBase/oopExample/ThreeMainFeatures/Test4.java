package JavaBase.oopExample.ThreeMainFeatures;

class Adults{
    Adults(){
        System.out.println("我大于18岁");
        write();
        System.out.println("我已经毕业了");
    }

    public void write() {
        System.out.println("我是成年人");
    }
}

 class Kids extends Adults{
    private  int age = 3;
    public Kids(int age){
        this.age = age;
        System.out.println("小孩子的年龄是:"+this.age);
    }

    public void write(){
        System.out.println("小孩子上幼儿园的年龄是：" + this.age);
    }
}


public class Test4 {
    public static void main(String[] args) {
        Kids k = new Kids(4);
        k.write();
    }

}
