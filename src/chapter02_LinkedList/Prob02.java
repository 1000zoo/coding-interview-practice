package chapter02_LinkedList;

/*
2.2 뒤에서 k 번째 원소 구하기 : 단방향 연결리스트가 주어졌을 때 뒤에서 k 번째 원소를 찾는 알고리즘을 구현하라.
 */

import java.util.ArrayList;

public class Prob02 {

    public static ListNode kthNodeFromEnd(ListNode head, int k) {
        ListNode faster = head;
        ListNode slower = head;
        for (int i = 0; i < k - 1; i++) {
            faster = faster.next;
            if (faster == null) {
                return null;
            }
        }
        while (faster != null) {
            if (faster.next == null) {
                break;
            }
            faster = faster.next;
            slower = slower.next;
        }
        return slower;
    }

    public static ListNode sol2(ListNode head, int k) {
        ListNode curr = head;
        int length = 0;

        while (curr != null) {
            curr = curr.next;
            length++;
        }
        if (k > length) {
            return null;
        }
        curr = head;
        for (int i = 0; i < length - k; i++) {
            curr = curr.next;
        }
        return curr;
    }
}
