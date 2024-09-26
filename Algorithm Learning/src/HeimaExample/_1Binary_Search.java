package HeimaExample;

import java.util.Scanner;

import static java.lang.Math.floor;

public class _1Binary_Search {
    /*
    * 需求： 在有序数组 A内 查找值target
    * 如果找到返回索引
    * 否则返回-1
    * */
    public static void main(String[] args) {
        int [] arr = new int[]{1,4,16,23,56,71,88,92};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        int target = Integer.parseInt(sc.next());
        int result = binarySearch(arr,target);

        System.out.println(result);
    }
    public static int binarySearch(int arr[],int target) {
        //[1,4,16,23,56,71,88,92]

        int i=0,j = arr.length-1;



        while (i<=j){
            int m = (i+j)/2;
            if (arr[m]<target){
                i=m+1;
            }else if (target<arr[m]){
                j=m-1;
            } else if (target == arr[m]) {
                return m;
            }
        }
        return -1;
    }
}
