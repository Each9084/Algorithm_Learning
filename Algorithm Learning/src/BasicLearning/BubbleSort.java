package BasicLearning;

public class BubbleSort {
    public static void main(String[] args) {
        int[] initArr = {4, 2, 9, 1, 3};
        int [] result = bubbleSort(initArr);
        
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            if (i< result.length-1) {
                System.out.print(result[i]+",");
            }else {
                System.out.print(result[i]);
            }


        }
        System.out.print("]");
    }

    public static int[] bubbleSort(int [] arr){
        int temp = 0;
        for (int i = arr.length-1;i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        return arr;
    }

}
