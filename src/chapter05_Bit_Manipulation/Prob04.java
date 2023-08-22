package chapter05_Bit_Manipulation;
/*
5.4 다음 숫자: 양의 정수가 하나 주어졌다. 이 숫자를 2진수로 표기했을 때,
             1비트의 개수가 같은 숫자 중에서 보다 큰 수 중 가장 작은 수와 작은 수 중 가장 큰 수를 구하라.
             (바로 이전 수와 바로 다음 수)
 */
public class Prob04 {
    public int prevNumber(int num) {
        int copy = num;
        int c0 = 0;
        int c1 = 0;

        while ((copy & 1) == 1) {
            c1++;
            copy >>= 1;
        }

        while ((copy & 1) == 0 && copy != 0) {
            c0++;
            copy >>= 1;
        }

        int p = c0 + c1;

        num &= -(1 << (p + 1));
        num |= (((1 << (c1 + 1)) - 1) << c0 - 1);

        return num;
    }

    public int nextNumber(int num) {
        int copy = num;
        int c0 = 0;
        int c1 = 0;

        //0이 끝나는 위치 확인
        while ((copy & 1) == 0 && copy != 0) {
            c0++;
            copy >>= 1;
        }

        //1이 끝나는 위치 확인
        while ((copy & 1) == 1) {
            c1++;
            copy >>= 1;
        }

        int p = c0 + c1;
        num |= (1 << p);
        num &= -(1 << p);   // num &= ~((1 << p) - 1);
        num |= (((1 << c1) - 1) << (c0 + 1));

        return num;
    }
}
