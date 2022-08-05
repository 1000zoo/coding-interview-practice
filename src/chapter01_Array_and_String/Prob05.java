package chapter01_Array_and_String;

/*
1.5 하나 빼기 : 문자열을 같게 만들기 위한 편집 회수가 1회 이내인지 확인하는 함수를 작성하여라.
    return : 1회 이내이면 true, 아니면 false
 */

public class Prob05 {

    // Solution1
    // Big-O : O(N)
    public static boolean similar01(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }
        String longer, shorter;
        if (s1.length() > s2.length()) {
            longer = s1;
            shorter = s2;
        } else if (s1.length() < s2.length()) {
            longer = s2;
            shorter = s1;
        } else {
            return sameCase(s1, s2);
        }
        int diffCounter = 0;

        for (int i = 0, j = 0; i < shorter.length(); j++) {
            if (shorter.charAt(i) != longer.charAt(j)) {
                if (diffCounter > 1) {
                    return false;
                }
                diffCounter++;
            } else {
                i++;
            }
        }
        return true;
    }

    // Solution01 을 위한 메소드
    private static boolean sameCase(String s1, String s2) {
        int diffCounter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diffCounter > 1) {
                    return false;
                }
                diffCounter++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(similar01("qsert", "qwert"));
    }
}


/*

    // Wrong Solution1
    // 문자열이 ASCII 코드로만 이루어진 경우
    public static boolean wrongSolution1(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }
        int[] checker1 = new int[128];
        int[] checker2 = new int[128];
        int diffCounter = 0;

        for (int i = 0; i < s1.length(); i++) {
            checker1[(int) s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            checker2[(int) s2.charAt(i)]++;
        }
        for (int i = 0; i < checker1.length; i++) {
            if (checker1[i] != checker2[i]) {
                if (diffCounter > 1) {
                    return false;
                }
                diffCounter++;
            }
        }
        return true;
    }
 */