class Solution 
{
    public String reverseVowels(String s) 
    {
        StringBuilder st = new StringBuilder();
        char ch = ' ';
        int i = 0, j = s.length()-1;

        while(i<s.length())
        {
            ch = s.charAt(i++);
            if(ch=='A' || ch =='a' || ch=='e' || ch=='E' || ch=='I'|| ch=='i' || ch=='U' || ch=='u' || ch=='O'|| ch=='o')
            {
                while( j>= 0)
                {
                    ch = s.charAt(j--);
                    if(ch=='A' || ch =='a' || ch=='e' || ch=='E' || ch=='I'|| ch=='i' || ch=='U' || ch=='u' || ch=='O'|| ch=='o')
                    {
                        st.append(ch);
                        break;
                    }
                }
            }
            else
                st.append(ch);
        }

        return st.toString();

    }
}