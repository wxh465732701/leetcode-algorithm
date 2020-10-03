package com.wxh;

import org.junit.Test;

/**
 * @author wangxiaohui56
 * @date 2020/9/17 10:22
 */
public class KMPServiceTest {

    @Test
    public void simpleTest(){
        System.out.println(new KMPService().kmp("ababababca","abababca"));
    }
}
