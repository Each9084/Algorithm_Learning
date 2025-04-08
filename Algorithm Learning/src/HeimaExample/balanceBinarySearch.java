package HeimaExample;

public class balanceBinarySearch {
    public static void main(String[] args) {
        int [] example = {1,2,3,4,5,6,7,8,9};
        int target = 8;

        int result = balanceBinarySearch(example,target);
    }

    public static int balanceBinarySearch(int [] example, int target){
        int i = 0;
        int j = example.length;

        while(1<j-i){
            int m = (i+j)>>1;
            if (target< example[m]){
                j = m;
            } else if (example[m]<=target) {
                i = m;
            }
        }

        if (target == example[i]){
            return  target;
        }else {
            return -1;
        }
    }
}
