package chapter02_LinkedList;

/*
2.6 회문 : 주어진 연결리스트가 회문인지 검사하는 함수를 작성하라.
 */

import java.util.Stack;
import java.util.ArrayList;

public class Prob06 {

    //Time : O(2 * N) => O(N)
    //Space: O(N)
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.val != st.pop()) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

    //Time : O(N)
    //Space: O(N) => ListNode reverse
    public static boolean isPalindrome2(ListNode head) {
        ListNode curr = head;
        ListNode reverse = reverse(head);
        while (curr != null) {
            if (reverse == null) {
                return false;
            }
            if (curr.val != reverse.val) {
                return false;
            }
            curr = curr.next;
            reverse = reverse.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode head) {
        ListNode answer = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = answer;
            answer = curr;
            curr = next;
        }
        return answer;
    }
}
