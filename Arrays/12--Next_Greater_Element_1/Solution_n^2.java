class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        
        int n = num1.length;
        int m = num2.length;
        int arr[] = new int[n];
        
        
        for(int i=0; i<n ;i++)
        {
            for(int  j=0; j<m; j++)
            {
                if( num1[i] == num2[j] )
                {
                    arr[i] = findGreater(num2, j, m);
                }
            }
        }
        return arr;
        
    }
    
    public static int findGreater(int arr[], int j, int n)
    {
        if(j ==(n-1))
        {
            return -1;
        }
        int m =-1;
        for(int i=j+1; i<n;i++)
        {
            if( arr[i] > arr[j] )
            {
                return arr[i];
            }

            if( arr[n-(i-j)] > arr[j] )
            {
               m = arr[ n- (i-j) ];
            
            }
            if (arr[i] == arr[n-(i-j)] && m==-1 )
            {
                return -1;
            }
            
            
        }
        return m;
    }
}