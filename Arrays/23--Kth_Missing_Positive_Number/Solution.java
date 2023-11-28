class Solution {
    public int findKthPositive(int[] arr, int k) {

        int num = 1, i=0;
        while(k>0 && i<arr.length)
        {
            if(num==arr[i])
            {
                ++i;
                ++num;
            }
            else if(num!=arr[i])
            {
                k = k-1;
                num++;
            }
        }
        return (num+k-1);        


    }
}