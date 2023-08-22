package chapter05_Bit_Manipulation;
/*
5.3 비트 뒤집기: 어떤 정수가 주어졌을 때, 이 정수의 비트 하나를 0 -> 1 로 바꿀 수 있다.
              이때 1 이 연속으로 나올 수 있는 가장 긴 길이를 구해라.
 */
public class Prob03 {
    public int flipBit(int num) {
        int max = -1;
        for (int i = 0; i < Integer.toBinaryString(num).length(); i++) {
            int zero = num & (1 << i);

            if (zero == 0) {
                int temp = num | (1 << i);
                max = Math.max(max, getMaximumLengthOfOnes(temp));
            }

        }
        return max;
    }

    private int getMaximumLengthOfOnes(int num) {
        int max = -1;
        int curr = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                curr++;
            } else {
                max = Math.max(max, curr);
                curr = 0;
            }
            num >>= 1;
        }

        return Math.max(max, curr);
    }
}
