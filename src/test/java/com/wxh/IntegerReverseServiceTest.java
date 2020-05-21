package com.wxh;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangxiaohui56
 * @date Created in 21:40 2020/5/21
 */
public class IntegerReverseServiceTest {

    @Test
    public void reverseTest() {
        Assert.assertEquals(321, new IntegerReverseService().reverse(123));
    }

    @Test
    public void reverseTest2() {
        Assert.assertEquals(-321, new IntegerReverseService().reverse(-123));
    }

    @Test
    public void reverseTest3() {
        Assert.assertEquals(21, new IntegerReverseService().reverse(120));
    }

    @Test
    public void reverseTest4() {
        Assert.assertEquals(0, new IntegerReverseService().reverse(1534236469));
    }

    @Test
    public void reverseTest5() {
        Assert.assertEquals(-2143847412, new IntegerReverseService().reverse(-2147483648));
    }
}
