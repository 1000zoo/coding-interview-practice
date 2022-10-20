package chapter02_LinkedList;

import java.util.HashSet;
import java.util.ArrayList;

/*
2.1 중복 없애기 : 정렬되어 있지 않은 연결리스트가 주어졌을 때, 이 리스트에서 중복되는 원소를 제거하는 코드를 작성하여라.
 */

public class Prob01 {

    //Time : O(N)
    //Space: O(N)
    public static void deleteDuplication(ListNode head) {
        HashSet<Integer> set = new HashSet<>(){{
            add(head.val);
        }};
        ListNode curr = head;
        while (curr.next != null) {
            if (set.contains(curr.next.val)) {
                curr.next = curr.next.next;
            } else {
                set.add(curr.next.val);
            }
            curr = curr.next;
            if (curr == null) {
                System.out.println("mooYaHo");
                return;
            }
        }
    }

    //Time : O(N)
    //Space: O(N)
    public void sol2(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            if (set.contains(curr.val)) {
                prev.next = prev.next.next;
            } else {
                set.add(curr.val);
                prev = curr;
            }
            curr = curr.next;
        }
    }
}
