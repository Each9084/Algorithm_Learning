package JavaBase.oopExample.AbstractExample;

abstract class Hero {
    protected String name;
    protected String zone;
    protected int age;

    public Hero(String name,String zone,int age){
        this.name = name;
        this.zone = zone;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }


    abstract void loadModel();

    public void Recall(){
        System.out.println(getName() + "已回城");
    }


}
