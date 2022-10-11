import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;
        int a = 0, num, x, y;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    a = (i * 1000) + j;
                    arr.add(a);
                }
            }
        }

        a = arr.size();

        for (int i = 0; i < a; i++) {
            num = arr.get(i);
            x = num % 1000;
            y = num / 1000;
            for (int j = 0; j < m; j++) {
                matrix[j][x] = 0;
            }
            for (int j = 0; j < n; j++) {
                matrix[y][j] = 0;
            }
        }

    }
}