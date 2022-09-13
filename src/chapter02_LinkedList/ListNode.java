package chapter02_LinkedList;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(List<Integer> list) {
        ListNode curr = this;
        for (Integer i : list) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode curr = this;

        while (curr != null) {
            sb.append(curr.val);
            if (curr.next != null) {
                sb.append(",");
            }
            curr = curr.next;
        }
        return sb.toString();
    }
}
