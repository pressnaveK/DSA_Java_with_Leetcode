package org.algo;
import org.algo.DataStructures.SinglyLinkedList;
import org.algo.Leetcode.ListNode;


public class Main {
    public static void main(String[] args) {
        ListNode List1 , List2 , Sum;
        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = {9,9,9,9};
        List1 = ListNode.ArrayToListNode(arr1);
        List2 = ListNode.ArrayToListNode(arr2);
        Sum = ListNode.addTwoNumbers(List1,List2);
        ListNode.print(Sum);







    }
}