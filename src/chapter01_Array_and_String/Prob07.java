package chapter01_Array_and_String;

/*
1.7 행렬 회전 : 이미지를 표현하는 N by N 행렬이 있을 때, 이미지의 각 픽셀은 4 바이트로 표현된다.
              이미지를 90도 회전시키는 메서드를 작성하라.
              extra) 행렬을 추가로 사용하지 않는 메서드
 */

import java.util.Arrays;

public class Prob07 {

    //Solution 1
    //행렬을 추가로 사용
    public static int[][] rotation(int[][] m) {
        int l = m.length;
        int[][] ans = new int[l][l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                ans[j][l - 1 - i] = m[i][j];
            }
        }

        return ans;
    }

    //Solution 2
    //행렬 추가사용 X
    //미완성
    public static int[][] rotationMatrix(int[][] m) {
        int l = m.length;
        int temp = 0;
        int rotCount = 3;

        int ii, jj;
        int iii, jjj;

        int ml = m.length % 2 == 0 ? m.length / 2 : m.length / 2 + 1;

        for (int i = 0; i < ml; i++) {
            for (int j = 0; j < ml; j++) {
                ii = i;
                jj = j;
                temp = m[i][j];

                while (rotCount > 0) {
                    iii = l - 1 - j;
                    jjj = i;
                    m[i][j] = m[iii][jjj];
                    i = iii;
                    j = jjj;

                    rotCount--;
                }
                rotCount = 3;
                m[i][j] = temp;
                i = ii;
                j = jj;
            }
        }
        return m;
    }

    public static void main(String[] args) {
//        int[][] mat = {{0, 1, 2, 3}, {1, 2, 3, 4}, {5, 6, 7, 8}, {3, 4, 5, 6}};
        int[][] mat = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        printMatrix(mat);
        System.out.println();
        printMatrix(rotationMatrix(mat));
    }

    public static void printMatrix(int[][] m) {
        for (int[] ints : m) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
