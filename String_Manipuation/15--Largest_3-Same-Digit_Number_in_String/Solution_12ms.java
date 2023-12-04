class Solution {
    public String largestGoodInteger(String num) {

        int st= 0, max = 0, f =0 ;
        int i =0;
        while(i<num.length()-2)
        {
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2))
            {
                st = (int)num.charAt(i);
                i = i+2;
                f =1;
            }
            if( st>max)
            {
                System.out.println(max +"  "+st);
                max = st;
            }
            i = i+1;
        }

        
        if( f== 0)
        {
            return "";
        }

        String op = String.valueOf((char)max);
        op = op+op+op;
        return op;
        
    }
}