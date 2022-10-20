package chapter02_LinkedList;

import java.util.ArrayList;

public class Prob03 {

    public static void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
        next.next = null;
    }
}
