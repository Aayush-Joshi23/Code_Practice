class Solution {
    public int findSpecialInteger(int[] arr) {

        int n = arr.length;
        int  c = 0, num = arr[0];

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == num)
            {
                c++;
            }
            else
            {
                num = arr[i];
                c = 1;
            }
            if(c>= (n/4)+1 )
            {
                return num;
            }
        }
        return num;
        
    }
}