package JavaBase.CollectionAndFrame.StackExample;

public class CircularArray {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        int i = 0;
        while (i<arr.length){
            System.out.println(arr[i]);
            i = (i+1)% arr.length;
        }
    }
}
