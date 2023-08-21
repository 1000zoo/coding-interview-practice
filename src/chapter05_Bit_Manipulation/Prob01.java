package chapter05_Bit_Manipulation;
/*
4.9 삽입: 두 개의 32 비트 수 N과 M이 주어지고, 비트 위치 i와 j가 주어졌을 때, M과 N에 삽입하는 메서드를 구현하라.
         M은 N의 j번 째 비트에서 시작하여, i 번째 비트에서 끝난다. j번째 비트에서 i 번째 비트까지에는 M을 담기에 충분한 공간이 있다고 가정한다.
         다시 말해, M = 10011(2) 이라면, i와 j 사이에 적어도 다섯 비트가 있다고 가정해도 된다는 것이다.
         j = 3, i = 2 인 경우 처럼 M을 삽입할 수 없는 상황은 생기지 않는다고 봐도 된다.

         ex)
         input => N = 10000000000, M = 10011, i = 2, j = 6
         output=> N = 10001001100
 */
public class Prob01 {
    public int solution(int n, int m, int i, int j) {
//        int leftMask = n & (~((1 << (j + 1)) - 1));
        int leftMask = n & (-(1 << (j + 1)));
        int rightMask = n & ((1 << i) - 1);
        m <<= i;
        return leftMask + m + rightMask;
    }
}
