import java.io.*;

class Result {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. STRING a
     * 2. STRING b
     */

    public static int makeAnagram(String a, String b) {
        // Write your code here

        int arr1[] = new int[26];
        int arr2[] = new int[26];
        int n = a.length(), m = b.length();
        int l = m > n ? m : n;
        char ch1 = ' ';

        for (int i = 0; i < l; i++) {
            if (i < n) {
                ch1 = a.charAt(i);
                arr1[(((int) ch1) - 97)] += 1;
            }
            if (i < m) {
                ch1 = b.charAt(i);
                arr2[(((int) ch1) - 97)] += 1;
            }
        }

        m = 0;
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                m += Math.abs(arr1[i] - arr2[i]);
            }
        }

        return m;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
