import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int n = matrix[0].length, m = matrix.length;
        int mi = 0, mid = 0;
        List<Integer> lst = new ArrayList<Integer>();

        for (int i = 0; i < m; i++) {
            mi = matrix[i][0];
            mid = 0;
            for (int j = 1; j < n; j++) {
                if (mi > matrix[i][j]) {
                    mi = matrix[i][j];
                    mid = j;
                }
            }
            if (maxCol(matrix, i, mid)) {
                lst.add(mi);
            }
        }

        return lst;

    }

    public static boolean maxCol(int[][] arr, int i, int j) {
        int max = arr[i][j];
        // System.out.println(i+" " +j+" "+max);
        for (int a = 0; a < arr.length; a++) {
            // System.out.println("$$"+arr[i][j]);
            if (max < arr[a][j]) {
                return (false);
            }
        }
        return true;
    }
}