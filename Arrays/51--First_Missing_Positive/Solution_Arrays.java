class Solution {
    public int firstMissingPositive(int[] nums) {

        int l = nums.length+1;
        boolean bool[] = new boolean[l];
        for(int n: nums)
        {
            if(n>0 && n<=l)
                bool[n-1] = true;
        }
        int i = 1;
        for(boolean b: bool)
        {
            if(!b)
                return i;
            i++;
        }
        return i;
        
    }
}