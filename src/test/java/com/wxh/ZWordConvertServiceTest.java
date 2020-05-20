package com.wxh;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangxiaohui56
 * @date Created in 22:45 2020/5/20
 */
public class ZWordConvertServiceTest {
    @Test
    public void convertTest() {
        Assert.assertEquals("LCIRETOESIIGEDHN", new ZWordConvertService().convert("LEETCODEISHIRING", 3));
    }

    @Test
    public void convertTest2() {
        Assert.assertEquals("LDREOEIIECIHNTSG", new ZWordConvertService().convert("LEETCODEISHIRING", 4));
    }

    @Test
    public void convertTest3() {
        Assert.assertEquals("", new ZWordConvertService().convert("", 1));
    }

    @Test
    public void convertTest4() {
        Assert.assertEquals("A", new ZWordConvertService().convert("A", 1));
    }

    @Test
    public void convertTest5() {
        Assert.assertEquals("A", new ZWordConvertService().convert("A", 2));
    }
}
