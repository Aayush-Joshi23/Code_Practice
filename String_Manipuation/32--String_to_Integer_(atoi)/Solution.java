
class Solution {
    public int myAtoi(String s) {

        s = s.trim();
        char ch = ' ';
        int n = 0;
        double num = 0;
        boolean neg= false, pos = false, nn = false ;

        for(int i =0; i<s.length(); i++)
        {

            ch = s.charAt(i);
            
            if (ch == '-')
            {
                if(nn)
                    break;
                if(pos||neg)
                    return 0;
                else
                    neg = true;
            }
            
            else if(ch=='+' )
            {
                if(nn)
                    break;
                if(neg||pos)
                    return 0;
                else
                {
                    pos = true;
                    continue;
                }
            }
            
            else if(ch>='0' && ch<='9')
            {
                num = num*10 + (ch-'0');
                nn = true;
            }
            
            else 
                break;
        
        }
        
        if(neg)
        {
            num = -1 * num;
        }
            
        if(num > Integer.MAX_VALUE)
            n =  Integer.MAX_VALUE;
        else if (num < Integer.MIN_VALUE)
            n = Integer.MIN_VALUE;
        else
            n = (int)num;

        return n;
        
    }
}