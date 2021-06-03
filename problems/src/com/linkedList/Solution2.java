package com.linkedList;

public class Solution2 {


    public static void main(String[] args) {
      int arr1[]={9,9,9,9,9,9,9};
      int arr2[]={9,9,9,9};
        ListNode l1 = MyLinkListUtil.generateLinkedList(arr1);
        MyLinkListUtil.printTheLinkedList(l1);

        ListNode l2 = MyLinkListUtil.generateLinkedList(arr2);
        MyLinkListUtil.printTheLinkedList(l2);

        ListNode result = addTwoNumbers(l1, l2);
        MyLinkListUtil.printTheLinkedList(result);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result= new ListNode();

        ListNode  t1=l1;
        ListNode  t2=l2;
        ListNode re=result;
        int carry=0;
        ListNode newNode=null;
        do {
            int v1=0;
            int v2=0;

            if(t1!=null){
                v1=t1.val;
            }

            if(t2!=null){
                v2=t2.val;
            }


            int sum = v1+v2+carry;

            carry=sum/10;

            re.val=sum%10;

            if(t1!=null){
                t1=t1.next;
            }
            if(t2!=null){
                t2=t2.next;
            }
            if(t1!=null || t2!=null) {
                newNode= new ListNode();
                re.next=newNode;
                re=re.next;
            }

        }while(t1!=null || t2!=null);

        if(carry!=0){
            newNode= new ListNode();
            newNode.val=carry;
            re.next=newNode;
        }

        return result;

    }
}
