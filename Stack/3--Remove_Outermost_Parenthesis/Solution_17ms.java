class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Character> stk = new Stack<>();
        String st = "";
        int l = s.length(), c = 1;
        stk.push('(');

        for(int i=1; i<l; i++)
        {
            char ch = s.charAt(i);
            if(ch =='(' && c!=0)
            {
                st += ch;
                stk.push(ch);
                c++;
            }
            else if(ch == ')' && c>1)
            {
                stk.pop();
                st += ')';
                c--;
            }
            else if(ch == ')' && c == 1)
            {
                stk.pop();
                c--;
            }
            else if(ch=='(' && c==0)
            {
                stk.push(ch);
                c++;
            }
        }

        return st;
        
    }
}