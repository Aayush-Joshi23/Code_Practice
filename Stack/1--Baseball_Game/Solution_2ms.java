class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stk = new Stack<>();
        int prev = 0, cur = 0, sum = 0;
        for(String st: operations)
        {
            
            if(st.equals("+"))
            {
                stk.push(cur+prev);
                prev = cur;
                cur = stk.peek();
                sum += cur;
            }


            else if(st.equals("D"))
            {
                stk.push(cur*2);
                prev = cur;
                cur = stk.peek();
                sum += cur;
            }

            else if(st.equals("C"))
            {
                sum -=cur;
                if(stk.size()>=3)
                {
                    stk.pop();
                    cur = stk.peek();
                    stk.pop();
                    prev = stk.peek();
                    stk.push(cur);
                }
                else if(stk.size()==2)
                {
                    stk.pop();
                    cur = stk.peek();
                    prev = 0;
                }
                else if(stk.size()==1)
                {
                    cur = 0;
                    prev = 0;
                    stk.pop();
                } 
            }


            else
            {
                prev = cur;
                cur = Integer.parseInt(st);
                stk.push(cur);
                sum += cur;
            }
        }
        return sum;
        
    }
}