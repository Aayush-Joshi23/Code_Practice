class Solution {
    public String maximumOddBinaryNumber(String s) 
    {
        
        int c1 = 0, c0 = 0;
        char ch = ' ';

        for(int i=0;i<s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch=='1')
                c1++;
            else 
                c0++;
        }

        StringBuilder st = new StringBuilder();

        while(c1>1)
        {
            st.append('1');
            c1--;
        }
        while(c0>0)
        {
            st.append('0');
            c0--;
        }
        st.append('1');
        
        return st.toString();

    }
}