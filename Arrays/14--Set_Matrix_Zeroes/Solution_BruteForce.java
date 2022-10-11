import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr.add(new ArrayList<Integer>());
                if (matrix[i][j] == 0) {
                    arr.get(k).add(0, i);
                    arr.get(k).add(1, j);
                    k = k + 1;
                    System.out.print(matrix[0] + "  ");
                }
                System.out.println();
            }
        }
        int a = 0, b = 0;

        if (k >= (m * n)) {
            for (int ar[] : matrix)
                Arrays.fill(ar, 0);
        }

        else {
            for (int i = 0; i < k; i++) {
                a = arr.get(i).get(0);
                b = arr.get(i).get(1);

                for (int j = 0; j < m; j++) {
                    matrix[j][b] = 0;
                }

                for (int j = 0; j < n; j++) {
                    matrix[a][j] = 0;
                }
            }
        }

    }
}