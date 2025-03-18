package HeimaExample;

import java.util.ArrayList;
import java.util.List;

public class binary_Search_213 {
    public static void main(String[] args) {

        int [] example = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        int result = binarySearch(example, target);

        System.out.println(result);

    }

    public static int binarySearch(int [] arrayList,int target){
        int i = 0;
        int j = arrayList.length -1;
        int result = -1;
        while (i <=j){
            int m = (i+j)>>>1;
            if (target < arrayList[m]){
                j = m-1;
            }else if (arrayList[m] < target){
                i = m+1;
            }else {
                result = m;
                return result;
            }
        }
        return -1;
    }

}
