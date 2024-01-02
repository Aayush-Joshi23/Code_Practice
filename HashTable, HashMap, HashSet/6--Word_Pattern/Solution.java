class Solution {
    public boolean wordPattern(String pattern, String s) {


        String st[] = s.split(" ", 0);
        if(st.length!=pattern.length())
        {
            return false;
        }

        char ch = ' ';
        HashMap<Character, String> map = new HashMap<>();

        for(int i = 0; i<pattern.length(); i++)
        {
            ch = pattern.charAt(i);
            if(map.containsKey(ch) && !(map.get(ch).equals(st[i]) ) )
            {
                return false;
            }
            else if ( map.containsValue(st[i]) && !(map.containsKey(ch)))
            {
                return false;
            }
            else if(!map.containsKey(ch))
            {
                map.put((Character)ch, st[i]);
            }
        }
        return true;
        
        
    }
}