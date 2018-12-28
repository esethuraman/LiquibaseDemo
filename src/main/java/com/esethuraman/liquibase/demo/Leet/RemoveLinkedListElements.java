package com.esethuraman.liquibase.demo.Leet;

public class RemoveLinkedListElements {


    public ListNode removeElements(ListNode head, int val) {

        ListNode previous = null;
        ListNode current;

        if(head == null){
            return head;
        }
        current = head;

        while(current != null){
            if(current.val == val){
//                if the target is head, then head itself should be moved
                if(previous == null){
                    current = current.next;
                    head = current;
                }
                else{
                    previous.next = current.next;
                    current = previous.next;
                }
            }
            else{
                previous = current;
                current = current.next;
            }
        }
        return head;

    }


    public static void main(String[] args) {

        RemoveLinkedListElements obj = new RemoveLinkedListElements();
//        obj.removeElements(ListNode.populateList(new int[]{1,2,3,4,5}), 4);
        obj.removeElements(ListNode.populateList(new int[]{}), 4);
//        obj.removeElements(ListNode.populateList(new int[]{5,2,3,4,5}), 5);
//        obj.removeElements(ListNode.populateList(new int[]{1,5,5,4,5}), 5);
//        obj.removeElements(ListNode.populateList(new int[]{5,5,5,5,5}), 5);

    }
}

