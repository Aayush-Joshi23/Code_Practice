class Solution {
    public char findTheDifference(String s, String t) {

        int s1 =0, s2 = 0;
               
        for(char ch: s.toCharArray())
            s1 += (int)ch;
            
        for(char ch: t.toCharArray())
            s2 += (int)ch;
            
        
        return (char)(s2-s1);
        
    }
}