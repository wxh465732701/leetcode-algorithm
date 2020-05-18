package com.wxh;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangxiaohui56
 * @date Created in 23:54 2020/5/16
 */
public class TwoSumServiceTest {
    @Test
    public void twoSumTest() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Assert.assertEquals("false", Arrays.toString(new TwoSumService().twoSum(nums, target)), "[0, 1]");
    }
}
