package JavaBase;

public class instanceExample {
    static class Car{
        String color;
        String branch;

         static int wheels = 4;


         Car(String color,String branch){
             this.color = color;
             this.branch = branch;
         }

        void changeColor(String color){
            this.color = color;
        }

         static void getWheels(){
             System.out.println(wheels);;
        }

        public String changeBranch(String branch){
            return this.branch = branch;
        }
    }


    public static void main(String[] args) {
        Car myCar = new Car("blue","benz");
        myCar.changeColor("yellow");
        System.out.println(myCar.color);
        Car.getWheels();
    }
}
