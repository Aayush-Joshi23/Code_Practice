class Solution {
    public int minOperations(String[] logs) {

        int l = logs.length;
        Stack<String> stk = new Stack<>();

        for(int i=0; i<l; i++)
        {
            if(logs[i].equals("../"))
            {
                if(!(stk.isEmpty()))
                    stk.pop();
            }
            else if(logs[i].equals("./"))
            {
                continue;
            } 
            else
            {
                stk.push(logs[i]);
            }     

        }
        return stk.size();
    }
}