class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int c = 0, n = 0, ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            n = nums[i];
            c = 0;
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j]<n)
                    c++;
            }
            ans[i] = c;
        }
        return ans;
    }
}