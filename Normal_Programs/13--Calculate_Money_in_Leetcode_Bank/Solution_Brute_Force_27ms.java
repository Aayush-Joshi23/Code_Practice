class Solution {
    public int totalMoney(int n) {

        int sum = 0, r = 0, d = 1;
        if(n>7)
        {
            d = n/7;
            while(d>0)
            {
                sum += 28+ (7*(d-1));
                d--;
                System.out.println(d+"  ] "+sum);
            }
            System.out.println(sum+"    "+d+"   "+n);
            d = n/7;
            d+=1;
            n = n%7;
        }
        while(n>0)
        {
            sum += d;
            System.out.println(sum+" **   "+d+"   "+n);
            d += 1;
            n -= 1;
        }
        return sum;
        
    }
}