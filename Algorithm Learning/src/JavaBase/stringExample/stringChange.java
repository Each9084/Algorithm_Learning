package JavaBase.stringExample;


class User{
    private String username;
    private String password;

    public User(String username,String password){
        this.username = username;
        this.password = password;

    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}

public class stringChange {

    public static void main(String[] args) {
        User user = new User("neil","123");
        String[] newInfo = getUserInfo(user);
        newInfo[0] = "tom";
        newInfo[1] = "321";

        // 输出原始 User 对象中的用户名和密码
        System.out.println("原始用户名: " + user.getUsername());
        System.out.println("原始密码: " + user.getPassword());

    }

    public static String[] getUserInfo(User user){
        String[] userInfo = new String[2];
        userInfo[0] = user.getUsername();
        userInfo[1] = user.getPassword();
        return userInfo;
    }

}
