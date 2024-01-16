class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 0, prev = Integer.MIN_VALUE, c = 0, i =0, ind = 0;
        
        for(int cur: nums)
        {
            if(cur==prev && c<2)
            {
                count++;
                c++;
                if(i!=ind)
                {
                    nums[i] = cur;
                    i++;
                }
                else
                {
                    i++;
                }
            }
            else if(cur!=prev)
            {
                prev = cur;
                c = 1;
                count++;
                if(i!=ind)
                {
                    nums[i] = cur;
                    i++;
                }
                else
                {
                    i++;
                }
            }
            ind++;
        }
        return count;
        
    }
}