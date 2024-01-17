class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int n: arr)
        {
            if(map.containsKey(n))
                map.put(n, map.get(n)+1);
            else
                map.put(n,1);
        }
        for(Map.Entry<Integer, Integer> mp: map.entrySet())
        {
            if(list.contains(mp.getValue()))
                return false;
            else
                list.add(mp.getValue());
        }
        return true;
        
    }
}