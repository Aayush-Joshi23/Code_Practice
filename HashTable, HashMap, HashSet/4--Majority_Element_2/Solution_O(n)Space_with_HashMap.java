class Solution {
    public List<Integer> majorityElement(int[] nums) {

        if(nums.length <3)
        {
            ArrayList<Integer> lst = new ArrayList<>();
            for(int n: nums)
            {
                if(lst.contains(n))
                    continue;
                lst.add(n);
            }
            return lst;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr= new ArrayList<>();

        for(int n: nums)
        {
            if(map.containsKey(n) && (!(arr.contains(n))) )
            {
                map.put(n, (map.get(n)+1) );
                if(map.get(n)> nums.length/3 )
                    arr.add(n);
            }
            else
                map.put(n,1);
        }
        return arr;
        
    }
}