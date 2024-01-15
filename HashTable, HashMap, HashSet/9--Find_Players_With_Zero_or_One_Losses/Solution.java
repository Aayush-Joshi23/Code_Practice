class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< matches.length; i++)
        {
            if(!(map.containsKey(matches[i][0])))
                map.put(matches[i][0],0);
            
            if( map.containsKey(matches[i][1]) )
                map.put(matches[i][1], ( map.get(matches[i][1]) +1 ) );
            
            else
                map.put(matches[i][1], 1);
            
            
        }
        
        ArrayList<Integer> win = new ArrayList<>();
        ArrayList<Integer> lose = new ArrayList<>();

        for ( Map.Entry<Integer,Integer> ele : map.entrySet() )
        {
            if(ele.getValue()==0)
                win.add(ele.getKey());
            
            else if(ele.getValue()==1)
                lose.add(ele.getKey());
            
        }
        Collections.sort(win);
        Collections.sort(lose);
        List<List<Integer>> list = new ArrayList<>();
        list.add(win);
        list.add(lose);
        
        return list;

        
    }
}