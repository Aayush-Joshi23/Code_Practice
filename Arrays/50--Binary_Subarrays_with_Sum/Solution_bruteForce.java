class Solution 
{
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        
        int sum = 0, c = 0, j = 0;

        for(int i =0; i<nums.length; i++)
        { 
            j = i;
            sum = 0;

            while(j<nums.length && sum <= goal)
            {
                sum+= nums[j++];
                if(sum == goal)
                    c++;
            }

        }
        return c;
     
     }
}