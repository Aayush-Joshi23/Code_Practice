class Solution {
    public int maxSatisfaction(int[] s) {

        Arrays.sort(s);
        
        if(s[s.length-1] <=0)
            return 0;
        
        
        int sum1 = 0, sum2 = 0, max = 0;

        for( int i=s.length -1; i>=0 && sum1>=0; i--)
        {
            sum1 += sum2 + s[i];
            sum2 += s[i];
            if(sum1 > max)
                max = sum1;
        }

        return max;
        
    }
}