package com.mohammedabdoh.dsa.datastructures.linked_lists;

import java.util.HashSet;

public class LinkedListHasLoop {
    public static ListNode solution(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }

        HashSet<ListNode> elements = new HashSet<>();

        ListNode tmpHead = head;
        ListNode found = null;

        while(tmpHead != null) {
            if(!elements.contains(tmpHead)) {
                elements.add(tmpHead);
            } else {
                return tmpHead;
            }
            tmpHead = tmpHead.next;
        }

        return found;
    }
}

/*
 * ListNode node1 = new ListNode(3);
 * ListNode node2 = new ListNode(2);
 * ListNode node3 = new ListNode(0);
 * ListNode node4 = new ListNode(-4);
 * // ListNode node5 = new ListNode(5);
 * 
 * node1.next = node2;
 * node2.next = node3;
 * node3.next = node4;
 * // node4.next = node2;
 * // node5.next = node3;
 * 
 * ListNode result = LinkedListHasLoop.solution(node1);
 */
