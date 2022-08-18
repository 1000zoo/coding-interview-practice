package chapter01_Array_and_String;

/*
1.4 회문 순열 : 주어진 문자열이 회문의 순열인지 아닌지 확인하는 함수를 작성하여라.
    return : 회문의 순열이면 true, 아니면 false
 */

public class Prob04 {


    // Solution1
    // 문자열이 ASCII 코드로만 이루어진 경우
    // Big-O : Time : O(N), Space : O(1)
    public static boolean isPermutationOfPalindrome01(String s1) {
        int[] checker = new int[128];
        s1 = s1.replaceAll(" ", "");
        for (int i = 0; i < s1.length(); i++) {
            checker[(int) s1.charAt(i)]++;
        }
        int oddCounter = 0;
        for (int i : checker) {
            if (i % 2 != 0) {
                if (oddCounter != 0) {
                    return false;
                }
                oddCounter++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome01(""));
    }
}
