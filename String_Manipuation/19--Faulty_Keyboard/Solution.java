class Solution {
    public String finalString(String s) {

        StringBuilder st = new StringBuilder();
        char ch = ' ';

        for(int i=0; i<s.length(); i++)
        {
            ch = s.charAt(i);
            
            if(ch =='i')
                st = st.reverse();
            
            else
                st.append(ch);
            
        }
        return st.toString();
        
    }
}