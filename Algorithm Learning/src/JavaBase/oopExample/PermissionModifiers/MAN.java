package JavaBase.oopExample.PermissionModifiers;

import JavaBase.oopExample.nativeExample.People;

public class MAN extends People {
    public MAN(String name) {
        super(name);
    }

    public String toString(){
        return getName();
    }

}
