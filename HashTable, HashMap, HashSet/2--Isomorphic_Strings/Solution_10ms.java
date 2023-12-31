class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<>();
        Character chs , cht;
        
        for(int i = 0; i<s.length(); i++)
        {
            chs = (Character)(s.charAt(i));
            cht = (Character)(t.charAt(i));
            if(map.containsKey(chs))
            {
                if(cht != map.get(chs))
                    return false;
            }
            else
            {
                if(map.containsValue(cht))
                    return false;
                map.put(chs, cht);
            }
        }
        return true;
        
    }
}