package mySelfLearning;

public class binarySearch318 {
    public static void main(String[] args) {
        int [] example = {1,2,3,4,5,6,7,8,9};
        int target;
        int result;
        result = binarySearch318(example,10);
        System.out.println(result);
    }

    public static int binarySearch318(int[] example, int target){
        int i=0;
        int j =example.length-1;
        int m ;
        int result=-1;
        while(i<=j){
            m = (i+j)>>1;
            if (target <example[m] ){
                j =m-1;
            }else if(target>example[m]){
                i = m+1;
            } else if (example[m]==target) {
                result = m;
                return result;
            }

        }
        return -1;
    }
}
