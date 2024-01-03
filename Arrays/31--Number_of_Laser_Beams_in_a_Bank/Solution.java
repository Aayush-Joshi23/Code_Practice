class Solution {
    public int numberOfBeams(String[] bank) {

        int lprev = 0, lcur = 0, totcount = 0;
        for(String st: bank)
        {
            for(char ch: st.toCharArray())
            {
                if(ch=='1')
                    lcur += 1;
                
            }
            if(lcur >0)
            {
                totcount += (lcur*lprev);
                lprev = lcur;
                lcur = 0;
            }
        }
        return totcount;
    }
}