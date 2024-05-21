package BasicLearning;

import java.util.Arrays;
import java.util.Random;

import static Utils.printResults.compareResultAndInit;
import static Utils.printResults.printResult;

public class QuickSort {
    public static void main(String[] args) {
        //int[] initArr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        //int[] copyArr = Arrays.copyOf(initArr, initArr.length);
        int [] initArr= new int[10000000];
        Random r = new Random();

        for (int i = 0; i < initArr.length; i++) {
            initArr[i] = r.nextInt();
        }

        long startTime = System.currentTimeMillis();
        quickSort(initArr, 0, initArr.length - 1);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);


        //compareResultAndInit(copyArr, initArr);
    }

    private static void quickSort(int[] arr, int i, int j) {

        int start = i;
        int end = j;

        //给递归一个出口
        if (start>end) {
            return;
        }

        int pivot = arr[i];
        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < pivot) {
                    break;
                }
                end--;
            }

            //利用start从前往后找,找比基准数（pivot）大的数
            //写一个死循环
            while (true) {
                if (end <= start || arr[start] > pivot) {
                    break;
                }
                start++;
            }




            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
        //归位
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //确定6左边的位置 递归调用
        quickSort(arr,i,start-1);
        //确定6右边的位置 递归调用
        quickSort(arr,start+1,j);

    }
}
