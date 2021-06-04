package com.linkedList;

/**
 * @author avinash.a.mishra
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
* this was my forst approach which did not worked and did not have carryforward handeling
*
*
* */
class AddTwo1 {

    public static void main(String[] args) {
        addTwoNumbers(null,null);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result= new ListNode();

        ListNode  t1=l1;
        ListNode  t2=l2;
        ListNode re=result;

        do {
            re.val= t1.val+t2.val;
            t1=t1.next;
            t2=t2.next;
            if(t1!=null && t2!=null) {
                ListNode newNode= new ListNode();
                re.next=newNode;
                re=re.next;
            }

        }while(t1!=null && t2!=null);

        return result;
    }
}