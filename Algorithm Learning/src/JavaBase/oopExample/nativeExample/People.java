package JavaBase.oopExample.nativeExample;

public class People {
    private String name = null;

    public People(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }


    protected  void setName(String name) {
        this.name = name;
    }

}
