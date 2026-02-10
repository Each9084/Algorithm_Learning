package JavaBase.stringExample;

public class stringHash {

    public static void main(String[] args) {
        String s1 = "neil";


        int hashCode1 = s1.hashCode();
        System.out.println(hashCode1);


        int hashCode1Cache = s1.hashCode();
        System.out.println(hashCode1Cache);



        String s2 = "neil";
        int hashCode2 = s2.hashCode();
        System.out.println(hashCode2);

        s2.substring(3);



    }

}
