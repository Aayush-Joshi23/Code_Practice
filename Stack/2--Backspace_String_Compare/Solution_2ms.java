class Solution {
    public boolean backspaceCompare(String s, String t) {

        s = conv(s, s.length());
        t = conv(t, t.length());

        if(s.equals(t))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }

    private static String conv(String s, int l)
    {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i<l; i++)
        {
            if(s.charAt(i)=='#' && !(stk.isEmpty()))
            {
                stk.pop();
            }
            else if(!(s.charAt(i)=='#'))
            {
                stk.push(s.charAt(i));
            }
        }
        s ="";
        for(int i=0; i<stk.size();i++)
        {
            s += stk.get(i);
        }
        return s;
    }
}