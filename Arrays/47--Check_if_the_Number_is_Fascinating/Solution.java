class Solution {
    public boolean isFascinating(int n) {

        if(n>334)
            return false;
        long m = 0;
        m = (n*1000000) + (2*n*1000) +(3*n);

        int c[] = new int[9];
        long nn;
        while(m!=0)
        {
            nn = m %10;
            m = m/10;
            if(nn ==0)
                return false;
            else if(c[(int)(nn-1)] != 0)
                return false;
            else
                c[(int)(nn-1)] = 1;
        }
        return true;
        
    }
}