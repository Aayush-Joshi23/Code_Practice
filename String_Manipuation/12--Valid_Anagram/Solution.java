import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int n = s.length();

        int arr[] = new int[26];
        Arrays.fill(arr, 0);
        char ch = ' ';

        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            arr[((int) ch - 97)] += 1;

            ch = t.charAt(i);
            arr[((int) ch - 97)] -= 1;

        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}