package com.wxh;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangxiaohui56
 * @date Created in 23:49 2020/5/16
 */
public class TwoSumService {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int otherValue = target - nums[i];
            if (maps.containsKey(otherValue)) {
                return new int[]{maps.get(otherValue), i};
            }

            maps.put(nums[i], i);
        }

        throw new RuntimeException("无数据");
    }
}
