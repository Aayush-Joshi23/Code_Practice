class Solution {
    public int bestClosingTime(String customers) {

        char ch = ' ';
        int sum = 0, s = customers.length(), n=0, y=0;
        for(int i =0; i<s; i++)
        {
            ch = customers.charAt(i);
            if(ch == 'Y')
            {
                sum += 1;
            }
        }
        System.out.println(sum);

        if(sum == s)
        {
            return s;
        }
        else if(sum==0)
        {
            return 0;
        }
        else
        {

            int index = 0, min = sum, c=Integer.MAX_VALUE;
            for(int i = 0; i<s; i++)
            {
                ch = customers.charAt(i);
                min = sum -y +n;
                if(min<c)
                {
                    c = min;
                    index = i;
                }
                if(ch == 'Y')
                {
                    y += 1;
                }
                else
                {
                    n += 1;
                }
                System.out.println(sum);
                
            }
                min = sum -y +n;
                if(min<c)
                {
                    c = min;
                    index = s;
                }

            return index ;
            


        }
        
    }
}