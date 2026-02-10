package JavaBase.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class arraySort {
    public static void main(String[] args) {
        int [] arrayList = {7,5,1,4,2,3,6};
        Arrays.sort(arrayList);

        int index = Arrays.binarySearch(arrayList,2);
        System.out.println(index);
    }
}
