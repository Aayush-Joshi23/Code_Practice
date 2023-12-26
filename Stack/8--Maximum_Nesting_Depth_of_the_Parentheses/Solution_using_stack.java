class Solution {
    public int maxDepth(String s) {

        int max = 0;
        char ch=' ';
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch=='(')
            {
                stk.push(ch);
            }
            
            else if(ch==')' && !stk.isEmpty())
            {
                max = Math.max(max,stk.size());
                stk.pop();
            }

        }

        return max;


    }
}