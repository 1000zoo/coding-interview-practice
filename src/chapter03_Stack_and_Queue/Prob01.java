package chapter03_Stack_and_Queue;

/*
3.1 한 개로 세 개 : 배열 한 개로 스택 세 개를 구현하라.

=> 배열의 크기가 충분하다고 가정을 할 때, 배열 하나와 스택의 시작지점을 알리는 int 형 변수 (i1, i2, i3) 와 가장 마지막 지점을 알리는 변수를
   (f1, f2, f3) 클래스의 멤버변수로 지정해준다. (배열 또한 멤버변수로)
   만약 S1 (첫번째 스택) 에 데이터를 push 하고 싶다면, f1 번 째 배열에 값을 추가해주고 f1++ 을 해준다. 만약 f1 == i2 가 된다면, S2 의 모든
   데이터들을 한 칸씩 뒤로 보내준다. 데이터를 리턴받는 경우 (pop) f 값을 리턴해주고 f-- 를 해준다.
   => 하나의 스택에만 값이 많이 들어갈 경우 효율적일 수는 있지만, 일반적인 경우, 배열의 값을 다 뒤로 밀어낸다는 점에서 비효율적이다.

=> 전체 배열의 1/3 씩 할당해 주는 방식
 */

import java.util.Arrays;

public class Prob01 {
    private final int length = 10;
    private final int[] stack = new int[length];
    private final int[] startIndex= new int[] {0, length / 3, 2 * length / 3};
    private final int[] maxFinalIndex = new int[] {startIndex[1] - 1, startIndex[2] - 1, length - 1};

    private final int[] currIndex = Arrays.copyOf(startIndex, 3);

    public int size(int ch) {
        return currIndex[ch] - startIndex[ch];
    }
    public boolean push(int ch, int val) {
        if (currIndex[ch] <= maxFinalIndex[ch]){
            stack[currIndex[ch]++] = val;
            return true;
        }
        return false;
    }
    public int pop(int ch) {
        int _val = stack[currIndex[ch] - 1];
        stack[--currIndex[ch]] = 0;
        return _val;
    }
    public int peek(int ch) {
        return stack[currIndex[ch]];
    }
    public boolean isEmpty(int ch) {
        return size(ch) == 0;
    }
}
