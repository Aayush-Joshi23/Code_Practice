class Solution {
    public int maxDepth(String s) {

        int max = 0, temp = 0;
        char ch=' ';

        for(int i=0; i<s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch=='(')
            {
                temp++;
            }
            
            else if(ch==')' && temp!=0)
            {
                max = Math.max(max,temp);
                temp--;
            }
        }

        return max;


    }
}