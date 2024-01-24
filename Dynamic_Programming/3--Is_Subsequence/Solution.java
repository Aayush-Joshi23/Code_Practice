class Solution {
    public boolean isSubsequence(String s, String t) {

        int prevInd = 0, ind = 0;

        for(int i = 0 ; i < s.length(); i++)
        {

            if(prevInd >= t.length())
                return false;

            ind = t.indexOf(s.charAt(i), prevInd );

            if(ind == -1)
                return false;
            else
                prevInd = ind+1 ;

        }
        
        return true;

    }
}