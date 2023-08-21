package chapter05_Bit_Manipulation;
/*
5.2 2진수를 문자열로: 0.72와 같이 0과 1 사이의 실수가 double 타입으로 주어졌을 때,
                  그 값을 2진수 형태로 출력하는 코드를 작성하라.
                  길이가 32 이하인 문자열로 2진수로 정확히 표현할 수 없다면, ERROR 출력
 */

public class Prob02 {
    public String doubleToBinaryString(double d) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString((int) d)).append(".");
        d %= 1;

        while (d != 0) {
            if (sb.length() == 32) {
                return sb.toString();
            }
            d *= 2;
            sb.append((int) d);
            d %= 1;
        }

        return sb.toString();
    }
}
