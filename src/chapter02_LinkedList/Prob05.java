package chapter02_LinkedList;

import java.util.ArrayList;

/*
2.5 리스트의 합 : 연결리스트로 숫자를 표현할 때 각 노드가 자릿수 하나를 가리키는 방식으로 표현할 수 있다.
               각 숫자는 역순으로 배열되어 있는데, 첫 번 째 자릿수가 리스트의 맨 앞에 위치하도록 배열된다는 뜻이다.
               이와 같은 방식으로 표현된 숫자 두 개가 있을 때, 이 두 수를 더하여 그 합을 연결리스트로 반환하는 함수를 작성하라.
 */

public class Prob05 {

    //Time : O(max(h1, h2)) => O(N)
    //Space: O(h1 + h2) => O(N)
    public static ListNode sum(ListNode head1, ListNode head2) {
        ListNode answer = new ListNode();
        ListNode ac = answer;
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        int carry = 0;
        int sum = 0;
        int i1 = head1.val, i2 = head2.val;

        while (true) {
            sum = i1 + i2 + carry;
            ac.next = new ListNode(sum % 10);
            carry = sum / 10;
            ac = ac.next;

            if (curr1.next != null && curr2.next != null) {
                curr1 = curr1.next;
                curr2 = curr2.next;
                i1 = curr1.val;
                i2 = curr2.val;
            } else if (curr1.next != null) {
                curr1 = curr1.next;
                i1 = curr1.val;
                i2 = 0;
            } else if (curr2.next != null) {
                curr2 = curr2.next;
                i1 = 0;
                i2 = curr2.val;
            } else {
                break;
            }
        }
        if (carry == 1) {
            ac.next = new ListNode(carry);
        }
        return answer.next;
    }
}
