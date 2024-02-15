class Solution {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length()<26)
            return false; 
            
        int sum = 0;
        char ch = ' ';
        HashSet<Character> set = new HashSet<>();

        for(int i =0; i<sentence.length(); i++)
        {
            ch = sentence.charAt(i);
            if( !(set.contains(ch)) )
            {
                set.add(ch);
                sum += (ch-'a'+1);
            }

            if(sum==351)
                return true;
        }

        return false;
    }
}