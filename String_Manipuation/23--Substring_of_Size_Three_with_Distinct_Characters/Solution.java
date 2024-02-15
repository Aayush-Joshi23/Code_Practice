class Solution {
    public int countGoodSubstrings(String s) {

        if(s.length() <3)
            return 0;

        char ch1 = s.charAt(0), ch2 = s.charAt(1), ch3 = ' ';
        int count = 0;
        for(int i=0; i<s.length()-2; i++)
        {
            ch3 = s.charAt(i+2);
            if(!(ch1==ch2 || ch2==ch3|| ch1==ch3) )
                count++;
            ch1 = ch2; 
            ch2=ch3;
        }
        return count;
        
    }
}