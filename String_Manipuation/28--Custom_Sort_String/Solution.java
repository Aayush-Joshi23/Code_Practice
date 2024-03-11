class Solution {
    public String customSortString(String order, String s) {

        int c[] = new int[26], tot = s.length();
        char ch = ' ';
        StringBuilder st = new StringBuilder();

        for(int i =0 ; i<tot; i++)
            c[s.charAt(i) -'a'] += 1;
        
        for(int i = 0; i<order.length(); i++)
        {
            ch = order.charAt(i);
            while(c[ch-'a'] >0)
            {
                st.append(ch);
                c[ch-'a'] -= 1;
                tot--;
            }
        }
        if(tot>0)
        {
            for(int i =0; i<26; i++)
            {
                while(c[i]>0)
                {
                    st.append((char)('a'+i));
                    c[i] -= 1;
                }
            }
        }
        return st.toString();
        
    }
}