package JavaBase.oopExample.ThreeMainFeatures;

public class Husband {

    private String name;

    private String sex;
    private int age;

    private Wife wife;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){


        if(age>120){
            System.out.println("ERROR:error age permission");
        }else if(age<0){
            System.out.println("NO WAY!");
        }else {
            this.age = age;
            System.out.println("Age: " + age+" had changed successfully");
        }


    }

    public Wife getWife(){
        return wife;
    }

    public void setWife(Wife wife){
        this.wife = wife;

    }










}
