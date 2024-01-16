class RandomizedSet {

   ArrayList<Integer> map;

    public RandomizedSet() {
        map = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        
        if(map.contains(val))
            return false;

        map.add(val);
        return true;
        
        
    }
    
    public boolean remove(int val) {
        
        if(map.contains(val))
        {
            map.remove( map.indexOf(val) );
            return true;
        }
        return false;
        
    }
    
    public int getRandom() {

        return map.get((int) ((Math.random() * (map.size() - 0)) + 0) );
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */