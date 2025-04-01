package Leetcode.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 * <p>
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 */
public class Binary4 {
    public static void main(String[] args) {

        int[] nums1 = {1,3};
        int[] nums2 = {2};
        Double result = findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
        
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int third = m + n;

        int[] nums3 = new int[third];

        System.arraycopy(nums1,0,nums3,0,m);
        System.arraycopy(nums2,0,nums3,m,nums2.length);
        Arrays.sort(nums3);

        int i = 0;
        int j = nums3.length;

        // 中位数的计算
        if (third % 2 == 1) {
            // 奇数长度，直接返回中间的元素
            return nums3[third / 2];
        } else {
            // 偶数长度，返回两个中间元素的平均值
            return (nums3[third / 2 - 1] + nums3[third / 2]) / 2.0;
        }

    }
}
