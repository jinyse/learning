
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/2 17:41
 * @Version V1.0
 */
public class 删除链表中的节点 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
