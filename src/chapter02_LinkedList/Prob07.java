package chapter02_LinkedList;

import java.util.HashSet;

/*
2.7 교집합 : 단방향 연결리스트 두 개가 주어졌을 때 이 두 리스트의 교집합 노드를 찾은 뒤
           반환하는 코드를 작성하라.

           ==> 단방향 linked list 는 한 번 겹치게 되면 끝까지 같은 노드여야 한다.
           ex)            n1____n2____
                                       \                        n5_____
                가능                     n3------n4     불가능 n3<
                                       /                        k2-----
                                     k1
 */

public class Prob07 {

    //Time : O(head1 * head2)
    //Space: O(head1 + head2)
    public static ListNode solution1(ListNode head1, ListNode head2) {
        ListNode curr1 = head1, curr2 = head2;
        while (curr1 != null) {
            while (curr2 != null) {
                if (curr1 == curr2) {
                    return curr1;
                }
                curr2 = curr2.next;
            }
            curr2 = head2;
            curr1 = curr1.next;
        }
        return null;
    }

    //Time : O(head1 + head2)
    //Space: O(2 * head1 + head2) => O(head1 + head2)
    public static ListNode solution2(ListNode head1, ListNode head2) {
        ListNode curr1 = head1, curr2 = head2;
        HashSet<ListNode> set = new HashSet<>();
        while (curr1 != null) {
            set.add(curr1);
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            if (set.contains(curr2)) {
                return curr2;
            }
            curr2 = curr2.next;
        }
        return null;
    }
}
