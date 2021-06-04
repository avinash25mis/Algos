package com.linkedList;

public class MyLinkListUtil {

    public  static ListNode generateLinkedList(int arr[]){
        ListNode topParent= new ListNode();
        ListNode adder=topParent;
        adder.val=arr[0];
        for(int i=1;i<arr.length;i++){
            ListNode newNode=new ListNode();
            newNode.val=arr[i];
            adder.next=newNode;
            adder=adder.next;
        }

        return topParent;

    }

    public static void printTheLinkedList(ListNode listNode){
        ListNode traversal=listNode;
        while (traversal!=null){
            System.out.print(traversal.val+",");
            traversal=traversal.next;
        }
        System.out.println();
    }
}
