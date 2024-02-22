class Solution {
    public int[] findErrorNums(int[] nums) {

        int arr[] = new int[2];
        int n[] = new int[nums.length+1];

        for(int i = 0; i<nums.length; i++)
        {
            n[nums[i]] += 1;
        }
        
        for(int i=1;i<n.length; i++)
        {
            if(n[i]>1)
                arr[0]=i;
            if(n[i]==0)
                arr[1] = i;

            if(arr[0]!=0 && arr[1]!=0)
                break;
        }
         
        return arr;
        
    }
}