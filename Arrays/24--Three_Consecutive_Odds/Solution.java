class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        int i=0;
        
        while(i<arr.length-2)
        {
            if(arr[i]%2>0)
            {
                if(arr[i+1]%2>0)
                {
                    if(arr[i+2]%2>0)
                    {
                        return true;
                    }
                        i = i+3;
                        continue;
                }
                    i = i+2;
                    continue;
            }
            else
            {
                i++;
            }
        }
        return false;
        
    }
}