package chapter01_Array_and_String;

/*
1.3 URL 화: 문자열에 들어있는 모든 공백을 '%20' 으로 바꾸어 주는 메서드를 작성하라.
           최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한 공간이 이미 확보 되어 있으며,
           문자열의 최종 길이가 함계 주어진다고 가정해도 된다.
           (자바로 구현할 시, character array 이용)
 */


public class Prob03 {
    // Solution1
    // StringBuilder 을 이용
    // Big-O : O(N)
    public static String toURL01(String s1) {
        StringBuilder url = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                url.append("%20");
            } else {
                url.append(s1.charAt(i));
            }
        }
        return url.toString();
    }

    // Solution2
    // character array 이용
    // Big-O : O(N)

    public static String toURL02(String s1) {
        int blank = countBlank(s1);
        char[] url = new char[(blank * 2) + s1.length()];

        for (int i = 0, j = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                url[j++] = '%';
                url[j++] = '2';
                url[j++] = '0';
            } else {
                url[j++] = s1.charAt(i);
            }
        }
        return new String(url);
    }

    public static int countBlank(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(toURL02("M  wo o"));
    }
}
