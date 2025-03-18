package mySelfLearning;

public class binarySearch318update {
    public static void main(String[] args) {
        int [] example = {1,2,3,4,5,6,7,8,9};
        int target;
        int result = binarySearch318update(example,4);
        System.out.println(result);

    }
    public static int binarySearch318update(int [] example,int target){
        int i=0,j = example.length;

        while(i<j){
            int m = (i+j)>>1;
            if (target < example[m]){
                j = m-1;
            }else if (example[m]<target){
                i = m+1;
            }else {
                return m;
            }
        }
        return -1;
    }
}
