class Solution {
    public boolean isPalindrome(String s) {

        int n = s.length(), c = 0;
        if (n == 0)
            return true;
        String str = "", str2 = "";

        for (int i = 0; i < n; i++) {
            c = (int) s.charAt(i);
            if (c >= 65 && c <= 90) {
                c = c + 32;
                str += (char) c;
                str2 = (char) c + str2;
            } else if ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                str += s.charAt(i);
                str2 = s.charAt(i) + str2;
            }

        }

        n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }
}