package org.algo.Leetcode;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
        this.next = null;
    }
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    //For Insertion of Data and printing
    public static ListNode ArrayToListNode(int [] arr){
        ListNode List = new ListNode();
        ListNode temp = List;
        for(int i = 0 ; i < arr.length; i++){
            temp.val = arr [i];
            if(i < arr.length - 1){
                temp.next = new ListNode();
            }
            temp = temp.next;
        }
        return List;

    }
    public static void print(ListNode List){
        ListNode temp = List;
        StringBuilder text = new StringBuilder();
        while(temp != null){
            text.append(temp.val);
            text.append(" -> ");
            temp = temp.next;
        }
        text.append(" null ");
        System.out.println(text);
    }
    //Leetcode Linked list problem-solving with java
    //Leetcode problem - 2
    public static ListNode addTwoNumbers(ListNode l1 , ListNode l2){
        //Solutions starts
        ListNode sum = new ListNode(0);
        ListNode temp1 , temp2 , temp;
        temp1 = l1;
        temp2 = l2;
        temp = sum;
        int reminder = 0;
        while(temp1 != null || temp2 != null){
            if(temp1 != null)temp.val += temp1.val;
            if(temp2 != null)temp.val += temp2.val;
            temp.val += reminder;
            reminder = temp.val / 10;
            temp.val %= 10;
            if(temp1 != null)temp1 = temp1.next;
            if(temp2 != null)temp2 = temp2.next;
            if(temp1 != null || temp2 != null){
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }
        if(reminder > 0){
            temp.next = new ListNode(reminder);
        }
        return sum;
        //Solution ends

    }

}


