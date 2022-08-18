package chapter01_Array_and_String;

/*
1.8 0행렬 : M by N 행렬의 한 원소가 0 일 경ㅇ우, 해당 원소가 속한 행과 열의 모든 원소를
           0 으로 설정하는 알고리즘을 작성하라.
 */

public class Prob08 {


    //Solution1
    //Big-O => O(M * N), Space => O(M * N)
    public static int[][] to0(int[][] m) {
        int[][] ans = matrixDeepCopy(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 0) {
                    for (int k = 0; k < m.length; k++) {
                        ans[k][j] = 0;
                    }
                    for (int k = 0; k < m[0].length; k++) {
                        ans[i][k]= 0;
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Prob07.printMatrix(to0(new int[][]{{1,2,3,1,1},{4,2,3,0,8},{1,2,3,2,3}}));
    }

    public static int[][] matrixDeepCopy(int[][] m) {
        int[][] ret = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            System.arraycopy(m[i], 0, ret[i], 0, m[0].length);
        }
        return ret;
    }
}
