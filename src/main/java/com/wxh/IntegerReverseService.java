package com.wxh;

/**
 * @author wangxiaohui56
 * @date Created in 21:21 2020/5/21
 */
public class IntegerReverseService {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }

        if (x == 0) {
            return x;
        }
        long result = 0;
        StringBuilder builder = new StringBuilder();
        int i = 0;
        boolean f = false;
        if (x < 0) {
            x = Math.abs(x);
            f = true;
        }

        while (x != 0) {
            int current = x % 10;
            x = x / 10;
            builder.append(current);
            i++;
        }

        result = Long.parseLong(builder.toString());
        if (f) {
            result = -result;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {//如果翻转后的数字超过int类型范围，则返回0
            return 0;
        }

        return (int) result;
    }

    public int reversePoc(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
                return 0;
            }

            rev = rev * 10 + pop;
        }

        return rev;
    }

    /**
     *  int 头最大为2 不用判断
     * @param x
     * @return
     */
    public int reversePoc2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 ) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE/10 ){
                return 0;
            }

            rev = rev * 10 + pop;
        }

        return rev;
    }
}
