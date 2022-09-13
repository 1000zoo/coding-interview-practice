package chapter02_LinkedList;

import java.util.ArrayList;

public class Prob03 {

    public static void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
        next.next = null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(7);
        ListNode listNode = new ListNode(list);
        listNode = listNode.next;
        System.out.println(listNode);
        ListNode node = listNode.next.next.next.next;
        System.out.println(node.val);
        deleteNode(node);
        System.out.println(listNode);
    }
}
