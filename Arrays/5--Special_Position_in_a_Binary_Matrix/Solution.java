
class Solution {
    public int numSpecial(int[][] mat) {

        int m = mat.length, n = mat[0].length;
        int tot = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    if (check(mat, i, j)) {
                        tot += 1;
                        break;
                    } else {
                        break;
                    }
                }

            }
        }
        return tot;
    }

    public static boolean check(int[][] mat, int i, int j) {
        for (int a = 0; a < mat.length; a++) {
            if (mat[a][j] == 1 && a != i) {
                return false;
            }
        }

        for (int a = 0; a < mat[0].length; a++) {
            if (mat[i][a] == 1 && a != j) {
                return false;
            }
        }
        return true;
    }
}