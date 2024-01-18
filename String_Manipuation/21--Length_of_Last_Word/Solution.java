class Solution {
    public int lengthOfLastWord(String s) {
        
        int  l = 0;
        char ch = ' ';
        s =s.trim();

        for(int i =s.length()-1; i>=0; i--)
        {
            ch = s.charAt(i);
            if(ch==' ')
                break; 
            
            else
                l++;
            
        }
        return l;

    }
}