package com.wxh;

import java.util.*;

/**
 * @author wangxiaohui56
 * @date Created in 20:19 2020/5/18
 */
public class LengthOfLongestSubstringService {

    /**
     * 滑动窗口算法
     * 
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int endIndex = -1;
        Set<Character> holder = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                holder.remove(s.charAt(i - 1));
            }

            while (endIndex + 1 < s.length() && !holder.contains(s.charAt(endIndex + 1))) {
                holder.add(s.charAt(endIndex + 1));
                endIndex++;
            }

            length = Math.max(length, endIndex - i + 1);
        }

        return length;
    }
}
