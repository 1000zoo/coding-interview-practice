package chapter05_Bit_Manipulation;
/*
5.6 변환: 정수 A와 B를 2진수로 표현했을 때,
         A를 B로 바꾸기 위해 뒤집어야 하는 비트의 개수를 구하는 함수를 만들어라
 */
public class Prob06 {

    public int countConvertedBits(int A, int B) {
        int answer = 0;

        for (int i = A ^ B; i > 0; i >>= 1) {
            answer += (i & 1) == 1 ? 1 : 0;
        }

        return answer;
    }
}
