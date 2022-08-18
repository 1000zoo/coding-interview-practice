package chapter01_Array_and_String;

/*
1.9 문자열 회전: 한 단어가 다른 문자열에 포함되어 있는지 판별하는 isSubstring 이라는 메서드가 있을 때,
              s2 가 s1 을 회전시킨 결과인지 isSubstring 을 한 번 만 호출하여 판별하라.

ex) waterbottle -> erbottlewat (true)
 */

public class Prob09 {

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;
        return isSubstring(temp, s2);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewa";
        System.out.println(isRotation(s1, s2));
    }

    public static boolean isSubstring(String s1, String s2) {
        int len = s1.length() - s2.length() + 1;
        String temp;
        for (int i = 0; i < len; i++) {
            temp = s1.substring(i, s2.length() + i);
            if (temp.equals(s2)) {
                return true;
            }
        }
        return false;
    }
}
