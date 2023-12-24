class Solution {
    public int minOperations(String s) {

        if(s.length()==1)
            return 0;


        int l = s.length(), c0 = 0, c1=0, c2=0, c3=0;
        char prev0 = '0', prev1 = '1', cur0 = ' ', cur1 =' ', last0 = '0', lcur0 =' ', last1 = '1', lcur1 = ' ';
        
        for(int i=0;i<l; i++)
        {
            cur0 = s.charAt(i);
            cur1 = s.charAt(i);         
            
            // cur 0
            if(cur0==prev0)
            {
                c0++;
                prev0 = prev0=='1'? '0':'1';
            }
            else
            {
                prev0 = cur0;
            }

            // cur 1
            if(cur1==prev1)
            {
                c1++;
                prev1 = prev1=='1'? '0':'1';
            }
            else
            {
                prev1 = cur1;
            }
            
            // last 0
            if(l-i-1 >= 0)
            {
                lcur0 = s.charAt(l-i-1);
                if(lcur0==last0)
                {
                    c2++;
                    last0 = last0=='1'?'0':'1';
                }
                else
                {
                    last0 = lcur0;
                }
            }

            // last 1
            if(l-i-1 >= 0)
            {
                lcur1 = s.charAt(l-i-1);
                if(lcur1==last1)
                {
                    c3++;
                    last1 = last1=='1'?'0':'1';
                }
                else
                {
                    last1 = lcur1;
                }
            }

        }

        return Math.min(Math.min(Math.min(c0,c1),c2),c3);
        
        
    }
}