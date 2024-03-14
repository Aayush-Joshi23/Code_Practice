class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        
        int a = numSub(nums, goal);
        int b = numSub(nums,goal-1);
        return a-b;
        
    }

    public int numSub(int []nums, int goal)
    {
         
        if(goal<0)
            return 0;


        int sum = 0, c = 0, j = 0, i=0;


        while(i<nums.length)
        { 
            sum += nums[i];
            while(sum > goal && j<nums.length )
            {
                sum-= nums[j];
                j++;
            }
            if(sum <=goal)
                c += i-j+1 ;

            i++;
        }
        return c;

    }
}
