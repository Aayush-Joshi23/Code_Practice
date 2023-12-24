class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Character> stk = new Stack<>();
        String st = "";
        int l = s.length(), c = 0;

        for(int i=0; i<l; i++)
        {
            if(s.charAt(i) =='(' )
            {
                if(c>0)
                    st+='(';
                stk.push('(');
                c++;
            }
            else 
            {
                if(c>1)
                    st+= ')';
                stk.pop();
                c--;
            }
            
            
        }
        return st;
        
    }
}