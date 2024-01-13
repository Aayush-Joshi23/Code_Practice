class Solution {
    public int minSteps(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        char ch = ' ';

        for(int i = 0; i<s.length();i++)
        {
            ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                map.replace(ch, (map.get(ch)+1) ) ;
            }
            else
            {
                map.put(ch, 1);
            }
        }
        
        int count = 0;

        for(int i = 0; i<t.length();i++)
        {
            ch = t.charAt(i);
            if(map.containsKey(ch))
            {
                if(map.get(ch)==0)
                {
                    count += 1;
                    map.remove(ch);
                    continue;
                }
                else
                {
                    map.replace(ch, (map.get(ch)-1) );
                }

            }
            else
            {
                count += 1;
            }
        }

        return count;

    }
}