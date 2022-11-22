class Solution {
    public int titleToNumber(String columnTitle) {

        int c, sum = 0, n = columnTitle.length();
        char ch = ' ';

        for(int i = 0; i<n; )
        {
            ch = columnTitle.charAt(i);
            c = ((int)ch) - 64;
            if(++i<n)
            {
                sum = sum*26 +c ;
            }
            else 
                sum = sum*26 +c;

        }

        return sum;
        
        
    }
}