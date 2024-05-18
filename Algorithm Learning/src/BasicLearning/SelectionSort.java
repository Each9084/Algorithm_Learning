package BasicLearning;



import java.util.Arrays;
import java.util.Calendar;

import static Utils.printResults.compareResultAndInit;


public class SelectionSort {
    public static void main(String[] args) {
        int[] initArr = {32, 25, 12,64, 7};
        int [] copyArr = Arrays.copyOf(initArr,initArr.length);
        int[] resultArr = selectionSort(initArr);
        compareResultAndInit(copyArr,resultArr);
    }

    public static int [] selectionSort(int [] arr){
        int temp,min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }

            if (min!=i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }
}
