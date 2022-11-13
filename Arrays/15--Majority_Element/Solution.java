import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length, c = 0, num = nums[0];

        for(int i =0;i<n; i++)
        {
            if(nums[i] == num)
            {
                c += 1;
            }
            else if(nums[i] != num && c>n/2)
            {
                break;
            }
            else 
            {
                num = nums[i];
                c = 1;
            }
        }
        return num;
   
    }
}