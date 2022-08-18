package chapter01_Array_and_String;

/*
1.6 문자열 압축 : 반복되는 문자의 개수를 세는 방식의 기본적인 문자열 압축 메서드를 작성하라.
               압축된 문자열이 기존의 문자열보다 길이가 길다면, 기존의 문자열을 반환.
input: aabcccaaa => return: a2b1c3a3
 */

public class Prob06 {


    //Solution 1
    //Big-O : Time : O(N), Space : O(N)
    public static String zip(String s) {
        StringBuilder sb = new StringBuilder();

        char temp = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (temp == s.charAt(i)) {
                count++;
            } else {
                sb.append(temp);
                sb.append(count);
                temp = s.charAt(i);
                count = 1;
            }
        }
        sb.append(temp);
        sb.append(count);
        String ans = sb.toString();
        return (ans.length() > s.length()) ? s : ans;
    }

    public static void main(String[] args) {
        System.out.println(zip("aaabbc"));
    }
}
