package chapter03_Stack_and_Queue;

/*
Prob 3.4 스택으로 큐: 스택 두 개로 큐 하나를 구현한 MyQueue 를 구현하여라.
 */

import java.util.Stack;


//MyQueue
public class Prob04 {
    private Stack<Integer> queue = new Stack<>();
    private Stack<Integer> backup = new Stack<>();

    public void add(int val) {
        queue.push(val);
    }

    public int poll() {
        if (queue.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        while (!queue.isEmpty()) {
            backup.push(queue.pop());
        }
        int _val = backup.pop();
        while (!backup.isEmpty()) {
            queue.push(backup.pop());
        }
        return _val;
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

}
