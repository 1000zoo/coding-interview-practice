package chapter01_Array_and_String;
import java.util.HashSet;


/*
1.1 중복이 없는가: 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하여라.
                자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
    Return: 중복이 있으면 true, 없으면 false
 */

public class Prob01 {

    // Solution 1
    // HashSet 이용
    // Big-O => O(NlogN)
    public static boolean hasReduplication01(String s) {
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                return true;
            } else {
                hs.add(s.charAt(i));
            }
        }
        return false;
    }

    // Solution 2
    // 추가 자료구조 이용 X
    // Big-O => O(N^2)
    public static boolean hasReduplication02(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(hasReduplication01(s));
    }
}
