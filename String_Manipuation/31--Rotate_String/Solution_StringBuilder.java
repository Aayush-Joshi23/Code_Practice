class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length())
            return false;
        
        if(s.equals(goal))
            return true;

        StringBuilder st =  new StringBuilder();
        char ch = ' ';
        int j = 0, l = s.length();
        String str = "";
        st.append(s);
        
        for(int i = 0; i<l-1; i++)
        {
            st = new StringBuilder((st.toString()).substring(1,l));
            st.append(s.charAt(i));
            if(st.toString().equals(goal))
                return true;
        
        }

        return false;
        
    }
}