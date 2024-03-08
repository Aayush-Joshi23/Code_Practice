class Solution {
    public int maxFrequencyElements(int[] nums) {
        
       HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0, c = 0;

        for(int n: nums)
        {
            if(map.containsKey(n))
            {
                map.put(n, map.get(n)+1);
                max = Math.max(max, map.get(n));
            }
            else
            {
                map.put(n, 1);
                max = Math.max(max, map.get(n));
            }
        }

        for(Integer e : map.values() )
        {
            if(e == max)
                c++;
        }
        
	return c*max;
    }
}