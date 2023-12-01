class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String st1 ="", st2="";
        int w1 = word1.length, w2 = word2.length, l = w1>w2? w1: w2;
        
        for(int i =0; i<l; i++)
        {
            if(i<w1)
            {
                st1 += word1[i];
            }
            if(i<w2)
            {
                st2 += word2[i];
            }
        }

        return (st1.equals(st2));
    }
}