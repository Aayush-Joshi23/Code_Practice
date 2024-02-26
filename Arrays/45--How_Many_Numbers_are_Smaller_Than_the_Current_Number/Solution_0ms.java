class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

       int[] arr = new int[102];
        
        for (int num : nums) 
            arr[num]++;
        
        for (int i = 1; i < arr.length; i++) 
            arr[i] += arr[i - 1];
        
        
        int[] result = new int[nums.length];
        
        
        for(int j =0; j<result.length; j++)
        {
            
            if(nums[j]==0)
                result[j] = 0;
            
            else
                result[j] = arr[nums[j] - 1];
            
            
        }
        return result;
    }
}