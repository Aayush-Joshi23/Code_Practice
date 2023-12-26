class Solution {
    public String makeGood(String s) {

        if(s.length()==1)
            return s;

        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length();i++)
        {
            if(stk.isEmpty())
            {
                stk.push(s.charAt(i));
            }
            else
            {
                if(stk.peek()==(s.charAt(i)+32) || (stk.peek()+32)==s.charAt(i))
                {
                    stk.pop();
                    continue;
                }
                else
                {
                    stk.push(s.charAt(i));
                }
            }
        }
        s = "";
        while(!stk.isEmpty())
        {
            s = stk.pop()+s;
        }
        return s;
    }
}