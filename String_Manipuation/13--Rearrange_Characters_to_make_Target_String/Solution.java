class Solution {
    public int rearrangeCharacters(String s, String target) {

        int tl = target.length(), sl = s.length(), l=100;
        if(sl<tl)
        return 0;

        int t[] = new int[26];
        int ss[] = new int[26];
        char ch = ' ';
        
        for(int i =0; i<sl; i++)
        {
            if(i<tl)
            {
                ch = target.charAt(i);
                t[((int)ch-97)] += 1;
            }
            ch = s.charAt(i);
            ss[((int)ch-97)] += 1;
        }

        for(int i =0; i< 26; i++)
        {
            if(t[i]!=0)
            {
                if(ss[i]<t[i])
                {
                    return 0;
                }
                if(ss[i]/t[i]>=1)
                {

                    if((ss[i]/t[i]) < l)
                    {
                        l = ss[i]/t[i];
                    }
                }
                
            }
        }
        return l;

    }
}