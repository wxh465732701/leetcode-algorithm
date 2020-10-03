package com.wxh;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangxiaohui56
 * @date 2020/9/21 10:40
 */
public class SpiralOrderServiceTest {

    @Test
    public void simpleTest(){
        int[][] matrix = {
                { 1,  2,  3,  4,  5  },
                { 6,  7,  8,  9,  10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };
        int[][] matrix2 = {
                { 1,  2,  3,  4,  5  },
                { 6,  7,  8,  9,  10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        List<Integer> resultList1 = SpiralOrderService.spiralOrder(matrix);
        System.out.println(Arrays.toString(resultList1.toArray()));
        List<Integer> resultList2 = SpiralOrderService.spiralOrder(matrix2);
        System.out.println(Arrays.toString(resultList2.toArray()));
    }
}
