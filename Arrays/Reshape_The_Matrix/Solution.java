package Reshape_The_Matrix;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length, n = mat[0].length;
        if ((r * c) != (m * n)) {
            return mat;
        }

        else {
            int arr[][] = new int[r][c];
            int a = 0, b = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    arr[a][b] = mat[i][j];
                    b++;
                    if (b >= c) {
                        b = 0;
                        a++;
                    }

                }
            }
            return arr;
        }

    }
}