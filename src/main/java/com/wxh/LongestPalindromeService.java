package com.wxh;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxiaohui56
 * @date Created in 15:27 2020/5/19
 */
public class LongestPalindromeService {
    public String longestPalindrome(String s) {
        String max = "";
        // 找到所有子串
        // "abccde"
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                boolean result = true;
                for (int k = 0; k < str.length() / 2; k++) {
                    if (str.charAt(k) != str.charAt(str.length() - k - 1)) {
                        result = false;
                        break;
                    }
                }

                if (result && max.length() < str.length()) {
                    max = str;
                }
            }
        }

        return max;
    }

    /**
     * Manacher算法，又叫“马拉车”算法，可以在时间复杂度为O(n)的情况下求解一个字符串的最长回文子串长度的问题。
     *
     * @param s
     * @return
     */
    public String manacher(String s) {
        // todo 最长回文子串
        return "";
    }
}
