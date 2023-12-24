class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder st = new StringBuilder();
        int c =0;

        for(char ch : s.toCharArray())
        {
            if(ch =='(' )
            {
                if(c>0)
                {
                    st.append('(');
                }
                c++;
            }
            else 
            {
                if(c>1)
                {
                    st.append(')');
                }
                c--;
            }
        }
        return st.toString();
        
    }
}