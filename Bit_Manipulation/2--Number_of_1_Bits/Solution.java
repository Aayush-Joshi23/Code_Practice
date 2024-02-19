public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int c = 0, bitMask = 1;

        for(int i =0; i<32; i++)
        {
            bitMask = 1<<i;
            c += (n & bitMask) ==0? 0: 1;
        }
        return c;
    }
}
