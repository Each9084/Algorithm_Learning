package JavaBase;

public class exampleToString {

    static class User{

        private String name;
        private int age;
        private String email;

        public User(String name, int age, String email) {
            this.name = name;    // 正确：this.name 指向当前对象的name
            this.age = age;      // 正确：this.age 指向当前对象的age
            this.email = email;  // 正确：this.email 指向当前对象的email
        }

        @Override
        public String toString() {
            return "User{name='" + name + "', age=" + age + ", email='" + email + "'}";
        }
    }


    public static void main(String[] args) {
        User user = new User("张三", 25, "zhangsan@email.com");
        //System.out.println(user);
        // 输出：User{name='张三', age=25, email='zhangsan@email.com'}
        String test = user.toString();
        System.out.println(test);
    }
}
