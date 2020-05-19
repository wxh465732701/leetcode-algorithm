package com.wxh;

import org.junit.Assert;
import org.junit.Test;

/**
 * 最长子串
 *
 * @author wangxiaohui56
 * @date Created in 14:14 2020/5/19
 */
public class LengthOfLongestSubstringServiceTest {
    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertEquals(3, new LengthOfLongestSubstringService().lengthOfLongestSubstring("abcassds"));
    }
}
