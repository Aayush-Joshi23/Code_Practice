class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for(int i=0; i<logs.length; i++)
        {
            if(map.containsKey(logs[i][0]))
                map.get(logs[i][0]).add(logs[i][1]);
            
            else
            {
                HashSet<Integer> set = new HashSet<>();
                set.add(logs[i][1]);
                map.put(logs[i][0], set);
            }
        }

        int[] arr = new int[k];

        for (Map.Entry<Integer, HashSet<Integer>> i : map.entrySet()) 
            arr[i.getValue().size() -1] += 1;
        
        return arr;
    }
}