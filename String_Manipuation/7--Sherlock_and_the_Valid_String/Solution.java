import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        // Write your code here

        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        char ch = ' ';

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (mp.get(ch) != null) {
                mp.put(ch, mp.get(ch) + 1);
            } else {
                mp.put(ch, 1);
            }
        }

        ArrayList<Integer> arr = new ArrayList(mp.values());
        int max = (int) Collections.max(arr);
        int min = (int) Collections.min(arr);

        if (min == max) {
            return "YES";
        }

        int maxc = 0, minc = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == max) {
                maxc++;
            } else if (arr.get(i) == min) {
                minc++;
            } else {
                System.out.println("EXIT IN LOOP" + arr.get(i));
                return "NO";
            }
        }

        System.out.println("MAX = " + max + " MIN = " + min + " MAXC = " + maxc + " MINC = " + minc);

        if (max == min)
            return "YES";

        if (min == 1 && minc == 1) {
            return "YES";
        }

        if (max == 1 && maxc == 1) {
            return "YES";
        }
        if ((max - min == 1) && (maxc == 1 || minc == 1)) {
            return "YES";
        }
        if (!(max == 1 && maxc == 1)) {
            return "NO";
        }

        if (!(max == 1 && maxc == 1)) {
            return "NO";
        }
        if (maxc > 1 && minc > 1) {
            return "NO";
        }

        if (Math.abs(maxc - minc) == 1) {
            return "YES";
        }
        return "NO";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
