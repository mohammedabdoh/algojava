package com.mohammedabdoh.dsa.datastructures.linked_lists;

// 1 <- 2 <- 3 <- 4 <- 5
/*
 * tail = 5
 * list = 5
 * nextElement = 5
 * nextElement.next = 4
 */

public class ReverseLinkedList {
    public static ListNode solution(ListNode list) {
        ListNode tail = new ListNode(list.val);
        while(list.next != null) {
            // get next Element
            ListNode nextElement = new ListNode(list.next.val);
            // Set next elements' next to previous element
            nextElement.next = tail;
            // Set tail to next element
            tail = nextElement;
            // move forward
            list = list.next;
        }
        return tail;
    }
}

