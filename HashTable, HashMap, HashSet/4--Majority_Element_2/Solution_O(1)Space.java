class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int c1 = 0, c2 = 0, n1 = nums[0], n2 = 0;
        for(int n: nums)
        {
            if(n==n1)
                c1 += 1;

            else if(n!= n1)
            {
                if(c1> nums.length/3)
                {
                    if(c2==0)
                    {
                        n2 = n1; 
                        c2 = c1;
                    }
                    else
                        break;
                    
                }
                n1 = n;
                c1 = 1;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        if(c1>nums.length/3 && c2>nums.length/3)
        {
            arr.add(n2);
            arr.add(n1);
        }
        else if(c1>nums.length/3)
            arr.add(n1);
        
        else if(c2>nums.length/3)
            arr.add(n2);
        

        return arr;
    }
}