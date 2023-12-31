class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if(nums.length == 1)
            return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer n;

        for(int i = 0; i<nums.length; i++)
        {
            n = (Integer)nums[i];
            if(map.containsKey(n))
            {
                
                if( ( Math.abs(map.get(n)-((Integer)i)) ) <=k )
                    return true;
            }
            map.put(n, ((Integer)i));
        }
        
        return false;
        
    }
}