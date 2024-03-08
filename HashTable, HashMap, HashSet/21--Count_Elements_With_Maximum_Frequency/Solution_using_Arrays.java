class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int max = 0, c = 0;

        int n[] = new int[100];
        for(int nn: nums)
        {
            n[nn-1]++;
            max = n[nn-1]> max ? n[nn-1] : max;
        }
        for(int nn: n)
        {
            if(nn == max)
                c++;
        }
        return c*max;
    }
}