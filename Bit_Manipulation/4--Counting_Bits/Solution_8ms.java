class Solution {
    public int[] countBits(int n) {

        int ans[] = new int[n+1], c = 0;

        for(int i =0; i<=n; i++)
        {
            for(int j =0; j<32; j++)
            {
                c += ((1<<j) & i) ==0? 0: 1;
            }
            ans[i] = c;
            c = 0;
        }
        return ans;
        
    }
}