package com.wxh;

/**
 * @author wangxiaohui56
 * @date 2020/9/16 19:01
 */
public class KMPService {

    /**
     * kmp字符匹配
     *
     * @param charStr  字符串
     * @param matchStr 模式串
     * @return 结果
     */
    public int kmp(String charStr, String matchStr) {

        if (charStr == null || charStr.length() == 0) {
            return -1;
        }

        if (matchStr == null || matchStr.length() == 0) {
            return 0;
        }

        int i = 0, j = 0;
        int[] next = getNext(matchStr);
        while (i < charStr.length() && j < matchStr.length()) {
            if (j == -1 || charStr.charAt(i) == matchStr.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        return j == matchStr.length() ? i - j : -1;
    }

    private int[] getNext(String matchStr) {
        int[] next = new int[matchStr.length()];
        next[0] = -1;
        int i = 0, j = -1;
        while (i < matchStr.length() - 1) {
            if (j == -1 || matchStr.charAt(i) == matchStr.charAt(j)) {
                ++i;
                ++j;
                next[i] = j;
            } else {
                j = next[j];
            }
        }

        return next;
    }
}
