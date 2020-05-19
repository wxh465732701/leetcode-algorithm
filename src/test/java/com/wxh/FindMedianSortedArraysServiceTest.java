package com.wxh;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

/**
 * @author wangxiaohui56
 * @date Created in 14:17 2020/5/19
 */
public class FindMedianSortedArraysServiceTest {
    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        System.out.println(new FindMedianSortedArraysService().findMedianSortedArrays(nums1, nums2));
    }
}
