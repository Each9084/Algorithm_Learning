package JavaBase.oopExample.PermissionModifiers;

import JavaBase.oopExample.nativeExample.People;

public class Main {
    public static void main(String[] args) {
        People wang = new People("wang");
        /*System.out.println(wang.getName());
        wang.setName("liu");
        System.out.println(wang.getName());*/


        MAN nanren = new MAN("wang");

        System.out.println(nanren.toString());
    }
}
