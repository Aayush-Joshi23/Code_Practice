class Solution {
    public String decodeMessage(String key, String message) {

        char c = ' ', ch='a';
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder st = new StringBuilder();
        int ind = 0, i=0;

        while(ind<26)
        {
            c = key.charAt(i++);
            
            if(c==' ')
                continue;
            else if(!(map.containsKey(c)))
            {
               map.put(c, (char)('a'+ind) );
               ind++;
            }

        }

        for(i=0; i<message.length();i++)
        {
            c = message.charAt(i);
            if(c==' ')
                st.append(' ');
            else
                st.append(map.get(c));
        }

        return st.toString();


        
    }
}