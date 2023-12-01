class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String st1 ="", st2="";
        
        for(String st: word1)
        {
            st1 += st;
        }
        for(String st: word2)
        {
            st2 += st;
        }
        return (st1.equals(st2));
    }
}