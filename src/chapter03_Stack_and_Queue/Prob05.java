package chapter03_Stack_and_Queue;

/*
3.5 스택정렬 : 가장 작은 값이 위로 오도록 스택을 정렬하는 프로그램을 작성하라.
             추가적으로 하나 정도의 스택은 사용해도 괜찮지만, 스택에 보관된 요소를 배열 등의
             다른 자료구조로 복사할 수는 없다. 스택은 push, pop, peek, isEmpty 의 네 가지 연산을 제공
 */

import java.util.*;

public class Prob05 {
    public static class PriorityStack {
        Stack<Integer> main;
        Stack<Integer> temp;

        public PriorityStack() {
            main = new Stack<>();
            temp = new Stack<>();
        }

        public void push(int val) {
            if (main.isEmpty()) {
                main.push(val);
            } else {
                while (!main.isEmpty() && main.peek() > val) {
                    temp.push(main.pop());
                }
                main.push(val);
                while (!temp.isEmpty()) {
                    main.push(temp.pop());
                }
            }
        }

        public int pop() {
            return main.pop();
        }

        public int peek() {
            return main.peek();
        }

        public boolean isEmpty() {
            return main.isEmpty();
        }

    }
}
