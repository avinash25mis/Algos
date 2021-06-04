package com.linkedList;

import com.linkedList.core.ListNode;
import com.linkedList.core.MyLinkListUtils;

public class Reversal {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,0};
        ListNode listNode = MyLinkListUtils.generateLinkedList(arr);
        MyLinkListUtils.printTheLinkedList(listNode);
       // ListNode reversed=reverseTwoStartingPointer(listNode);
        ListNode reversed=reverseThreeStartingPointer(listNode);
        MyLinkListUtils.printTheLinkedList(reversed);
    }

    private static ListNode reverseThreeStartingPointer(ListNode listNode) {
        ListNode prev=null;
        ListNode curr=listNode;
        ListNode next=null;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        listNode=prev;
        return  listNode;
    }

    private static ListNode reverseTwoStartingPointer(ListNode listNode) {
        ListNode prev = null;
        ListNode curr = listNode;

        while (curr!= null) {
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        listNode=prev; //this is make new head

        return listNode;
    }
}
