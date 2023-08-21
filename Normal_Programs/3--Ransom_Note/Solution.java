class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int ch[] = new int[26];
        Arrays.fill(ch,0);
        char c =' ';
        int rn = ransomNote.length(), m = magazine.length(), f =0;
        
        for(int i = 0; i<rn; i++ )
        {
            c = ransomNote.charAt(i);
            ch[ ((int)c) -97 ] += 1;
            f += 1;
        }

        for(int i = 0; i<m; i++ )
        {
            c = magazine.charAt(i);
            if(ch[ ((int)c) -97 ] > 0)
            {
                ch[ ((int)c) -97 ] -= 1;
                f -= 1;
            }
            if (f==0)  { return true; }
        }
        
        return false ;
        

    }
}
