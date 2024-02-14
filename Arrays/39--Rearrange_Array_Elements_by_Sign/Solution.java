class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int i=0, j=0;

        for(int n: nums)
        {
            if(n>0)
                pos[i++] = n;
            else
                neg[j++] = n;
        }

        j = 0;
        i= 0;
        for(; i<nums.length-1;)
        {
            nums[i++] = pos[j];
            nums[i++] = neg[j++];
        }
        return nums;
        
    }
}