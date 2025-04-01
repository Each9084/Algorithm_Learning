package mySelfLearning;

public class binarySearch41 {
    public static void main(String[] args) {
        int [] example = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        int result =  binarySearch(example,target);
        System.out.println(result);
    }

    private static int binarySearch(int[] example, int target) {
        int i = 0;
        int j = example.length-1;

        while(i<=j){
            int m = i+j >>1;
            if (target >example[m] ){
                i = m+1;
            }else if (target <example[m]){
                j = m-1;
            }else {
                return m;
            }
        }
        return -1;
    }


}
