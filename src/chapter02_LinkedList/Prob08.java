package chapter02_LinkedList;

import java.util.HashSet;

/*
2.8 루프 발견 : 순환 연결리스트가 주어졌을 때, 순환되는 부분의 첫째 노드를 반환하는 알고리즘을 작성하라.
 */

public class Prob08 {

    //Time : O(N)
    //Space: O(N)
    public static ListNode circularNode(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (set.contains(curr)) {
                return curr;
            }
            set.add(curr);
            curr = curr.next;
        }
        return null;
    }
}
