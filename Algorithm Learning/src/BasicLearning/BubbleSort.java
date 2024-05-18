package BasicLearning;

import java.util.Arrays;

import static Utils.printResults.compareResultAndInit;
import static Utils.printResults.printResult;

public class BubbleSort {
    public static void main(String[] args) {
        int[] initArr = {4, 2, 9, 1, 3};
        int[] copyArr = Arrays.copyOf(initArr, initArr.length);
        int [] resultArr = bubbleSort(initArr);

        //printResult(result);

        compareResultAndInit(copyArr,resultArr);
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
