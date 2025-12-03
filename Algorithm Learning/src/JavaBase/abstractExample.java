package JavaBase;

public class abstractExample {
    static abstract class Animal{

        private String name;


        public Animal(String name){
            this.name = name;
        }

        // 抽象方法 - 子类必须实现
        public abstract void makeSound();

        // 具体方法子类可以直接使用
        public void eat(){
            System.out.println(name + "在吃东西");
        }

        public String getName(){
            return name;
        }

    }

    static class Dog extends Animal{
        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(getName()+"汪汪");
        }
    }

    public static void main(String[] args) {
        Dog labuladuo = new Dog("拉布拉多");
        labuladuo.makeSound();
        labuladuo.eat();
    }
}
