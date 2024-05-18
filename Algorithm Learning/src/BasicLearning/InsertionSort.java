package BasicLearning;

import Utils.printResults;
import static Utils.printResults.compareResultAndInit;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] initArr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] copyArr = Arrays.copyOf(initArr, initArr.length);
        int startIndex = findUnorderedArray(copyArr);
        System.out.println(startIndex);
        System.out.println("----------------");

        int[] resultArr = insertionSort(copyArr, startIndex);

        compareResultAndInit(initArr,resultArr);


    }

    private static int[] insertionSort(int[] arr, int startIndex) {

        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        return arr;
    }

    private static int findUnorderedArray(int[] arr) {
        //找到无序的数组
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> arr[i+1]) {
                startIndex = i+1;
                return startIndex;
            }
        }
        return  -1;
    }


}
