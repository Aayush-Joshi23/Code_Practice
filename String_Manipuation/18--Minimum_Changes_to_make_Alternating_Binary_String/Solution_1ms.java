class Solution {
    public int minOperations(String s) {

        if(s.length()==1)
            return 0;

        int c0 =  count(s,'0');
        int c1 = count(s,'1');
        return c0>c1?c1:c0;
        
        
    }

    public static int count(String s, char prev)
    {
        char cur = ' ';
        int c = 0;
        for(int i=0;i<s.length(); i++)
        {
            cur = s.charAt(i);
            if(cur==prev)
            {
                c++;
                prev = prev=='1'? '0':'1';
            }
            else
            {
                prev = cur;
            }
        }
        return c;
    }
}