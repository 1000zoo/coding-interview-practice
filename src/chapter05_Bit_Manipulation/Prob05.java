package chapter05_Bit_Manipulation;
/*
5.5 디버거: 다음 코드가 하는 일을 설명하라.
           ((n & (n - 1) == 0)

=> 두 정수에 대해 & 연산이 0이 나오기 위해서는, 모든 자리의 비트가 모두 1이면 안된다.
    => n 이 2의 거듭제곱 수 인지 판단하는 코드이다.
 */
public class Prob05 {
    public boolean isSquareOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }
}
