class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        int m = matrix.length, n = matrix[0].length;
        if(m==1 || n==1)
            return true;
        int rr = 0, k =0;
        
        for(int i =0;i<n;i++)
        {
            rr = matrix[0][i];
            k = i+1;
            for(int  j =1;j<m; j++)
            {
                if(j < m && k <n )
                {
                    if(rr != matrix[j][k])
                    {
                        return false;
                    }
                    
                }
                k++;
            }
        }
        
        for(int i =0;i<m;i++)
        {
            rr = matrix[i][0];
            k = i+1;
            for(int  j =1;j<n; j++)
            {
                if(k < m && j <n )
                {
                    if(rr != matrix[k][j])
                    {
                        return false;
                    }
                    
                }
                k++;
            }
        }
        return true;
        
    }
}