package com.wxh;

/**
 * @author wangxiaohui56
 * @date Created in 23:58 2020/5/16
 */
public class AddTwoNumbersService {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int value1 = l1.val + l2.val;
        ListNode result = new ListNode(value1 % 10);
        int advance = value1 / 10;
        ListNode currentL1 = l1.next;
        ListNode currentL2 = l2.next;
        ListNode currentNode = result;
        for (int i = 0; currentL1 != null && currentL2 != null; currentL1 = currentL1.next, currentL2 = currentL2.next) {
            int value = advance + currentL1.val + currentL2.val;
            advance = value / 10;
            currentNode.next = new ListNode(value % 10);
            currentNode = currentNode.next;
        }

        while (currentL1 != null) {
            int value = currentL1.val + advance;
            currentL1.val = value % 10;
            advance = value / 10;
            currentNode.next = currentL1;
            currentNode = currentNode.next;
            currentL1 = currentL1.next;
        }

        while (currentL2 != null) {
            int value = currentL2.val + advance;
            currentL2.val = value % 10;
            advance = value / 10;
            currentNode.next = currentL2;
            currentNode = currentNode.next;
            currentL2 = currentL2.next;
        }

        if (advance > 0) {
            currentNode.next = new ListNode(advance);
        }

        return result;
    }

    public ListNode addTwoNumbersPro(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
