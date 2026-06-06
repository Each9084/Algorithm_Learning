package JavaBase.IoExample.assets;

import java.io.Serializable;

public class SerializationUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private  transient String password;

    public SerializationUser(String name,int age,String password){
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SerializationUser{name='"+name+"',age"+age+",password='"+password+"'}";
    }
}
