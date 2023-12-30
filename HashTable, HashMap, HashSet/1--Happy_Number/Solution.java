class Solution {
    public boolean isHappy(int n) {

        if(n==1)
            return true;
        
        Integer nn = n, sum = 9999, m =nn;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(nn != 1)
        {
            if(map.containsKey(nn))
            {
                return false;
            }
            else
            {
            
                sum = 0;
                m = nn;
                while(nn>0)
                {
                    sum += (nn%10)*(nn%10);
                    nn = nn/10;
                }
                map.put(m, sum);
                nn = sum;
            
            }
        }
        return true;
    }
}