class Solution {
    public String decodeMessage(String key, String message) {

        char c = ' ', ch[]= new char[26];
        StringBuilder st = new StringBuilder();
        int ind = 0, i=0;

        while(ind<26)
        {
            c = key.charAt(i++);
            
            if(c==' ')
                continue;
            else if( ch[c-97] == '\u0000' )
            {
                ch[c-97] = (char)('a'+ ind++) ;
            }
        }

        for(i=0; i<message.length();i++)
        {
            c = message.charAt(i);
            if(c==' ')
                st.append(' ');
            else
                st.append(ch[c- 97]);
        }

        return st.toString();
        
    }
}