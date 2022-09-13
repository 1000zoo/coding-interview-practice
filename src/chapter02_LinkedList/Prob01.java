package chapter02_LinkedList;

import java.util.HashSet;
import java.util.ArrayList;

/*
2.1 중복 없애기 : 정렬되어 있지 않은 연결리스트가 주어졌을 때, 이 리스트에서 중복되는 원소를 제거하는 코드를 작성하여라.
 */

public class Prob01 {
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
        deleteDuplication(listNode);
        System.out.println();
        System.out.println(listNode);
    }
}
