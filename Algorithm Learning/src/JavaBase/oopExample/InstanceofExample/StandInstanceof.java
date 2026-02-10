package JavaBase.oopExample.InstanceofExample;

import java.util.Objects;

class Shape{

}

class Ring extends Shape{

}

interface Cube{

}

class Box extends Shape implements Cube{

}

class Triangle implements Cube{

}

public class StandInstanceof {
    public static void main(String[] args) {
        Ring ring = new Ring();
        System.out.println(ring instanceof Shape);

        Box box = new Box();
        System.out.println(box instanceof Cube);

        Thread thread = new Thread();
        System.out.println(null instanceof Object);
    }
}
