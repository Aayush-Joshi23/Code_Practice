class Solution {
    public String sortSentence(String s) {
        
        String st[] = new String[9];
        s = s+" ";
        String str = "";
        int n =0;
        while ( s.length()>0 )
        {
            n = s.indexOf(' ');
            st[((int)s.charAt(n-1))-48-1] = s.substring(0, n-1);
            s = s.substring(n+1);
        }
        
        for(int i = 0; i<9;i++)
        {
            if(st[i] != null )
            {
                str += st[i] +' ';
            }
            else
            {
                break;
            }
        }
        return str.trim();
        
    }
}