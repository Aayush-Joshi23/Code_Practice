class Solution {
    public String countAndSay(int n) {

        if(n==1)
            return "1";
        
        int c =0, j =0;
        String st = "1";
        StringBuilder s;
        char ch = ' ', prev = '1';

        for(int i=1; i<n; i++)
        {
            prev = st.charAt(0);
            s = new StringBuilder();
            j=0; 
            c=0;

            while( j<st.length() )
            {

                ch = st.charAt(j++);
                
                if(ch==prev)
                    c++;
                else
                {
                    s.append((c+""));
                    s.append(prev);
                    prev = ch;
                    c=1;
                }

            }
            s.append((c+""));
            s.append(prev);
            st = s.toString();

        }

        return st;
        
    }
}