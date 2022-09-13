package chapter02_LinkedList;

import java.util.ArrayList;

/*
2.4 분할 : 값 x 가 주어졌을 때 x 보다 작은 노드들을 x 보다 크거나 같은 노드들 보다 앞에 오도록 하는 코드를 작성하라.
 */

public class Prob04 {
    //Time : O(N)
    //Space: O(N)
    public static ListNode rearrangement(ListNode head, int x) {
        ListNode answer = new ListNode(0, head);
        ListNode backup = head;
        ListNode answerCurr = answer;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val < x) {
                ListNode temp = answerCurr.next;
                answerCurr.next = new ListNode(curr.val, temp);
                // 마지막 노드를 지워야 할 경우
                if (curr.next == null) {
                    backup.next = null;
                    break;
                }
                deleteNode(curr);
                answerCurr = answerCurr.next;
            } else {
                backup = curr;
                curr = curr.next;
            }
        }
        return answer.next;
    }

    private static void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
        next.next = null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() {{
            add(1);
            add(2);
            add(9);
            add(8);
            add(7);
            add(4);
            add(4);
        }};
        ListNode head = new ListNode(list);
        head = head.next;
        System.out.println(head);
        ListNode newNode = rearrangement(head, 5);
        System.out.println(newNode);
    }
}
