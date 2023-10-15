package com.mohammedabdoh.dsa.datastructures.linked_lists;

public class MiddleOfLinkedList {
    public static ListNode solution(ListNode list) {
        if(list.next == null) {
            return list;
        }

        // Iterate over the whole list to count items
        int countOfNodes = 0; 
        int counter = 0;
        ListNode middleElement = new ListNode();

        ListNode head = list;

        while(head != null) {
            countOfNodes++;
            head = head.next;
        }

        int middleElementCount = countOfNodes / 2 + 1;
        head = list;

        while (counter < middleElementCount) {
            middleElement = head;
            head = head.next;
            counter++;
        }

        return middleElement;
    }
}
