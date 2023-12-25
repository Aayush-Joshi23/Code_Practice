class Solution {
    public String removeDuplicates(String s) {

        if(s.length()==1)
            return s;
        Stack<Character> stk = new Stack<>();
        String st = "";
        char cur = ' ';

        for(int i = 0; i< s.length() ;  i++)
        {
            cur = s.charAt(i);
            if(!stk.isEmpty() && cur == stk.peek())
            {
                stk.pop();
            }
            else 
            {
                stk.push(cur);
            }
        }
        for(Character ch : stk)
        {
            st += ch;
        }
        return st;
    }
}