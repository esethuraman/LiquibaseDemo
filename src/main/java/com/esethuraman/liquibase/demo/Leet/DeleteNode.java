package com.esethuraman.liquibase.demo.Leet;

public class DeleteNode {

    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode{

    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

    public static ListNode populateList(int[] arr){
        ListNode head = null;
        ListNode current = null;
        for(int a: arr){
            if(current == null){
                current = new ListNode(a);
                head = current;
            }
            else{
                current.next = new ListNode(a);
                current = current.next;
            }

        }
        return head;
    }
}