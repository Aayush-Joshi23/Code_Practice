class Solution {
    public String firstPalindrome(String[] words) {

        for(String st: words)
        {
            if(palin(st))
                return st;
        }
        return "";
        
    }

    public static boolean palin(String st)
    {
        if(st.length() == 1)
            return true;

        int n = st.length();
        for(int i= 0; i<n/2; i++)
        {
            if(st.charAt(i) != st.charAt(n-i-1) )
                return false;
        }
        return true;
    }


}