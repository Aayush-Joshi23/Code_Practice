class Solution {
    public int[] finalPrices(int[] prices) {

        boolean f = false;
        int answer[] = new int[prices.length];
        for(int i = 0; i<prices.length;i++)
        {
            f = false;

            for(int j=i+1; j<prices.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                    answer[i] = prices[i]-prices[j];
                    f =true;
                    break;
                }
            }
            if(!f)
                answer[i] = prices[i];
            
                
            
        }
        return answer;
        
    }
}