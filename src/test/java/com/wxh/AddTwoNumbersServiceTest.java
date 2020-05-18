package com.wxh;

import org.junit.Test;

/**
 * @author wangxiaohui56
 * @date Created in 0:08 2020/5/17
 */
public class AddTwoNumbersServiceTest {
    @Test
    public void addTwoNumbersTest(){
        AddTwoNumbersService.ListNode l1 = new AddTwoNumbersService.ListNode(2);
        l1.next = new AddTwoNumbersService.ListNode(4);
        l1.next.next = new AddTwoNumbersService.ListNode(3);
        AddTwoNumbersService.ListNode l2 = new AddTwoNumbersService.ListNode(5);
        l2.next = new AddTwoNumbersService.ListNode(6);
        l2.next.next = new AddTwoNumbersService.ListNode(4);
        AddTwoNumbersService.ListNode result = new AddTwoNumbersService().addTwoNumbers(l1,l2);

        AddTwoNumbersService.ListNode l11 = new AddTwoNumbersService.ListNode(5);
        AddTwoNumbersService.ListNode l22 = new AddTwoNumbersService.ListNode(5);
        AddTwoNumbersService.ListNode result2 = new AddTwoNumbersService().addTwoNumbers(l11,l22);
        System.out.println(111);
    }


    @Test
    public void addTwoNumbersTest2(){
        AddTwoNumbersService.ListNode l1 = new AddTwoNumbersService.ListNode(1);
        AddTwoNumbersService.ListNode l2 = new AddTwoNumbersService.ListNode(9);
        l2.next = new AddTwoNumbersService.ListNode(9);
        AddTwoNumbersService.ListNode result = new AddTwoNumbersService().addTwoNumbers(l1,l2);
        System.out.println(111);
    }
}
