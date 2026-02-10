package JavaBase.oopExample.InnerClassExample;

public class Child {

    abstract class Father{
        abstract void fish();
    }

    abstract class Teacher{
        abstract void programming();
    }


        private class FatherSide extends Father{

            @Override
            void fish() {
                System.out.println("继承了父亲的技能：去河边钓鱼");
            }
        }


        private class TeacherSide extends Teacher{

            @Override
            void programming() {
                System.out.println("继承了老师的技能：在电脑前写 Java");
            }
        }

        public void doFish(){
            new FatherSide().fish();
        }

        public void doProgramming(){
            new TeacherSide().programming();
        }



    public static void main(String[] args) {
        Child xiaoming = new Child();
        xiaoming.doFish();
        xiaoming.doProgramming();
    }

}
