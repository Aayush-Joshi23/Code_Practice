import java.util.Arrays;

class Solution {
    public int firstUniqChar(String s) {

        int arr[] = new int[26];
        int index[] = new int[26];
        char ch = ' ';
        int a = 0, k = 0, n = s.length();
        Arrays.fill(arr, 0);
        Arrays.fill(index, 0);

        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            a = ((int) ch) - 97;

            if (arr[a] == 0) {
                index[k] += i * 100 + a;
                k++;
            }

            arr[a] += 1;
            ;

        }

        for (int i = 0; i < 26; i++) {
            if (arr[index[i] % 100] == 1)
                return (index[i] / 100);

        }
        return -1;
    }
}