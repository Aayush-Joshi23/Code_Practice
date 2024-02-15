class Solution {
    public long largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        long sum = 0;

        for(int n: nums)
        {
            sum += n;
        }

        for(int n = nums.length-1; n>=0; n--)
        {
            if(nums[n]<(sum-nums[n]))
            {
                return sum;
            }
            sum = sum-nums[n];
        }
        return -1;
    }
}