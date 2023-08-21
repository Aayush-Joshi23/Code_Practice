class Solution {
    public int numberOfSteps(int num) {
        int n=0;
        while(num>0)
        {
            if(oddEven(num))
            {
                num = num/2;
                n++;
            }
            else
            {
                num -= 1;
                n++;
            }
        }
        return n;
        
    }
    public boolean oddEven(int num)
    {
        if(num%2==0) { return true; }
        else { return false; }
    }
}
