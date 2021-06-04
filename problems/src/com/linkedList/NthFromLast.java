package com.linkedList;

import com.linkedList.core.ListNode;
import com.linkedList.core.MyLinkListUtils;

/**
 * @author avinash.a.mishra
 */
public class NthFromLast {

    static int count;

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        ListNode listNode = MyLinkListUtils.generateLinkedList(arr);
        int i=0;
        pritNthfromLastResursion(listNode,3);
    }

     static void pritNthfromLastResursion(ListNode listNode, int n) {


      if (listNode == null)
           return;

         pritNthfromLastResursion(listNode.next, n);
         /*in recusion the code below the self function call get executed
         * as many times as as the code above  but in reverse order
         * */
         count++;
         if (count==n) {
            System.out.print(listNode.val);

        }


    }
}
