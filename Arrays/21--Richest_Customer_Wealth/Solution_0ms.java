class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        
        int sum = 0, max = 0, m = accounts.length, n = accounts[0].length ;
        for(int i = 0; i<m; i++)
        {
            sum = 0;
            for(int j =0; j<n; j++)
            {
                sum = sum+accounts[i][j];
            }
            
            max = max<sum? sum : max;
            
        }
        return max;
        
    }
}