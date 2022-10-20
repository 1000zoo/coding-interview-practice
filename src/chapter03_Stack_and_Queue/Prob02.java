package chapter03_Stack_and_Queue;

/**
 * 3.2 스택 Min: 기본적인 push 와 pop 기능이 구현된 스택에서 최솟값을 반환하는 min 함수롤 추가하려고 해라.
 */

public class Prob02 {
    private static class StackNode {
        private int data;
        private StackNode next;
        public StackNode(int data) {
            this.data = data;
        }
    }
    private StackNode top;
    private StackNode minStack;

    public int pop() {
        if (top == null) {
            return -9999;
        }
        int item = top.data;
        if (item == getMin()) {
            minStack = minStack.next;
        }
        top = top.next;
        return item;
    }

    public void push(int item) {
        if (minStack == null) {
            minStack = new StackNode(item);
        }
        StackNode t = new StackNode(item);
        t.next = top;
        top = t;
        if (item < minStack.data) {
            StackNode min = new StackNode(item);
            min.next = minStack;
            minStack = min;
        }
    }

    public int getMin() {
        return minStack.data;
    }
}
