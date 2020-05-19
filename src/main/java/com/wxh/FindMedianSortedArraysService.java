package com.wxh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author wangxiaohui56
 * @date Created in 13:40 2020/5/19
 */
public class FindMedianSortedArraysService {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        int medianIndex = nums.length / 2;
        if (nums.length % 2 == 0) {
            return (double) (nums[medianIndex - 1] + nums[medianIndex]) / 2;
        } else {
            return nums[medianIndex];
        }
    }
}
