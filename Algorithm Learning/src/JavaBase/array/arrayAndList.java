package JavaBase.array;

import java.util.ArrayList;
import java.util.List;

public class arrayAndList {
    Student s = new Student("王二");
    public static void main(String[] args) {
        int [] anArray = new int[] {1,2,3,4,5,6};
        List<Integer> aList = new ArrayList<>();
        for (int element:anArray){
            aList.add(element);
        }

    }
}
