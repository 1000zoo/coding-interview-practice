package chapter03_Stack_and_Queue;

/*
3.3 접시 무더기: 접시를 쌓다가 무더기가 어느 정도 높아지면 새로운 무더기를 만드는 것 처럼,
            이를 흉내내는 SetOfStacks 를 구현해라. SetOfStacks 는 여러 개의
            스택으로 구성되어 있으며, 이전 스택이 용량을 초과하는 경우, 새로운 스택을
            생성해야한다. SetOfStacks.push() 와 SetOfStacks.pop() 은 스택이
            하나인 경우와 동일하게 동작해야 한다.
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Prob03 {

    private final Stack<Stack<Integer>> stacks = new Stack<>();
    private final int MAX_CAPACITY = 10;

    public void push(int item) {
        if (stacks.isEmpty() || stacks.peek().size() == this.MAX_CAPACITY) {
            Stack<Integer> temp = new Stack<>();
            temp.push(item);
            stacks.push(temp);
        } else {
            stacks.peek().push(item);
        }
    }

    public int pop() {
        if (stacks.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        Stack<Integer> top = stacks.peek();
        int item = top.pop();
        if (top.isEmpty()) {
            stacks.pop();
        }
        return item;
    }

    // s0 s1 s2
    //

    public int popAt(int index) {
        if (index >= stacks.size()) {
            return Integer.MAX_VALUE;
        }
        int fromLast = stacks.size() - index;
        Queue<Stack<Integer>> q = new LinkedList<>();
        for (int i = 1; i < fromLast; i++) {
            q.add(stacks.pop());
        }
        int item = stacks.peek().pop();
        while (!q.isEmpty()) {
            stacks.push(q.poll());
        }
        return item;
    }

    public int getCurrentSize() {
        if (stacks.isEmpty()) return 0;
        return stacks.peek().size();
    }
}
