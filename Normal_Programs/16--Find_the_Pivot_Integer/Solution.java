class Solution {
    public int pivotInteger(int n) 
    {
        
        int sum1 = 0, sum2 = 0;

        for(int i = 1; i <= n; i++)
            sum1 += i;

        for(int i = 1; i<=n; i++)
        {
            sum2 += i;
            if(sum1 == sum2)
                return i;
            sum1 -= i;
        }

        return -1;

    }
}