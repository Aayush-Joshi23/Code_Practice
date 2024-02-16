class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n: arr)
            map.put(n, map.getOrDefault(n,0)+1);
        
        int cntarr[] = new int[100000];

        for(Integer n: map.keySet())
            cntarr[map.get(n)]++;
        
        int remove = 0;
        int ans = map.size();

        for(int i=1; i<cntarr.length; i++)
        {
            if(cntarr[i]>0)
            {
                remove = k/i;
                if(remove==0)
                    break;
                else
                {
                    remove = Math.min(remove, cntarr[i]);
                    ans -= remove;
                    k -= remove*i;
                }
            }
        }
        
        return ans;
        
    }
}