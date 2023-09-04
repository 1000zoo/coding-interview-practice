package chapter05_Bit_Manipulation;
/*
5.7 쌍끼리 맞바꾸기: 명령어를 가능한 적게 사용해서 주어진 정수의 짝수 번 째 비트의 값과
                 홀수 번 째 비트의 값을 바꾸는 프로그램을 작성하라
                 ex) 0 번째 비트와 1번째 비트를 바꾸고, 2 번째 비트와 3번째 비트를 바꾸는 식으로
 */
public class Prob07 {

    public int convertOddAndEvenBits(int num) {
        // 짝수번째 마스킹 후 오른쪽으로 | 홀수번째 마스킹 후 왼쪽으로
        return ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);
    }
}
