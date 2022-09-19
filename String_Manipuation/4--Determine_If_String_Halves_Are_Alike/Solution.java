public class Solution {

}

class Solution {
    public boolean halvesAreAlike(String s) {

        int l = s.length();

        return ((vowel((s.substring(0, l / 2)), l / 2)) == (vowel((s.substring(l / 2)), l / 2))) ? true : false;

    }

    public static int vowel(String s, int n) {

        int c = 0;
        char ch = ' ';

        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);

            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E')
                    || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
                c += 1;
            }

        }
        return c;
    }
}