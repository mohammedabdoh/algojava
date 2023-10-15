package com.mohammedabdoh.dsa.datastructures.linked_lists;

public class MergeTwoSortedLinkedLists {
    public static ListNode solution(ListNode list1, ListNode list2) {
        ListNode tmpHead = new ListNode();
        ListNode currentNode = tmpHead;

        if(list1 == null) {
            return list2;
        }

        if(list2 == null) {
            return list1;
        }

        while(list1 != null && list2 != null)  {
            if(list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else  {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        if(list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
        }

        if(list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
        }

        return tmpHead.next;
    }
}

