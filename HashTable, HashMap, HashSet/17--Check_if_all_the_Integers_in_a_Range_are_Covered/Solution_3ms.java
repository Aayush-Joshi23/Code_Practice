class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = left; i<=right; i++)
            set.add(i);
        
        for(int i=0; i<ranges.length; i++)
        {
            for(int j=ranges[i][0]; j<= ranges[i][1]; j++)
            {
                set.remove(j);
            }
        }

        return !(set.size()>0);        
    }
}