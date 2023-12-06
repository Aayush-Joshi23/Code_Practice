class Solution {
    public int totalMoney(int n) {

        int sum = 0, d = 1;
        if(n>7)
        {
            d = n/7;
            while(d>0)
            {
                sum += 28+ (7*(d-1));
                d--;
            }
            d = n/7;
            d+=1;
            n = n%7;
        }
        while(n>0)
        {
            sum += d;
            d += 1;
            n -= 1;
        }
        return sum;
        
    }
}
