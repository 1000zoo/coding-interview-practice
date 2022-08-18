package chapter01_Array_and_String;

/*
1.2 순열 확인: 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드를 작성하라.
    Return: 순열 관계라면 true, 아니라면 false
 */

import java.util.Arrays;

public class Prob02 {

    // Solution1
    // Arrays.sort() 를 이용
    // Big-O: 문자열의 길이가 같기 때문에  Time : O(Nlog(N)), Space(N)
    public static boolean isPermutation01(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    // Solution2
    // int[] 를 이용
    // s1 과 s2 가 ASCII 코드로만 이루어진 경우
    // Big-O => Time : O(N), Space : O(1)
    public static boolean isPermutation02(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] Checker1 = new int[128];
        int[] Checker2 = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            Checker1[(int) s1.charAt(i)]++;
            Checker2[(int) s2.charAt(i)]++;
        }
        for (int i = 0; i < Checker1.length; i++) {
            if (Checker1[i] != Checker2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation02("", ""));
    }
}
