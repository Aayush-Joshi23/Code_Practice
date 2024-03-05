class Solution {
    public int minimumLength(String s) 
    {

        char prevl = ' ', prevf = ' ', curf = ' ', curl = ' ';
        int f = 0, l = s.length()-1, c =0;
        char ch[] = s.toCharArray();

        while(f<l)
        {
            curf = ch[f];
            curl = ch[l];
            if(curf == prevl)
            {
                f++;
                prevf = curf;
            }
            else if(curl == prevf)
            {
                prevl = curl;
                l--;
            }
            else if(curf == curl)
            {
                prevl = curl;
                prevf = curf;
                l--;
                f++;
            }
            else {
                break;
            }
        }

        if(f == l && ch[f] == prevl)
        {
            return 0;
        }

        return l-f+1;

    }
}