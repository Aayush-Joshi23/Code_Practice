class Solution {
    public int maxScore(String s) {

        int  o = 0, z = 0, m=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='1')            
            o += 1;
        }
        if(o==s.length())
            return o-1;
        
        if(o==0)
            return s.length()-1;
        m = o-1;
        for(int i=0; i<s.length()-1;i++)
        {
            
            if(s.charAt(i)=='0')
            {
                z += 1;
                if((o+z)>m)
                {
                    m = o+z;
                    System.out.println(m+"  "+i);
                }
                
            }
            else
            {
                o--;
            }
            
        }
        
        return m;

        
        
    }
}