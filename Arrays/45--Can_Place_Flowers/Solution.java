class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n==0)
            return true;
            
        if(flowerbed.length<=1)
        {
            if(flowerbed[0] == 1)
                return false;
            return true;
        }

        int c=0;


        for(int i=0; i<flowerbed.length; i++)
        {

            if(i==0 && flowerbed[i]==0 && flowerbed[i+1] == 0)
            {
                flowerbed[i] = 1;
                c++;
            }

            else if(i== flowerbed.length-1 && flowerbed[i]==0 && i-1 >0 && flowerbed[i-1] == 0 )
            {
                flowerbed[i] = 1;
                c++;
            }

            else if( flowerbed[i]==0 && i!=0 && i!=flowerbed.length-1 )
            {
                if(flowerbed[i-1] == 0 && flowerbed[i+1]== 0)
                {
                    flowerbed[i] = 1;
                    c++;
                }
            }
        }

        if(n<=c)
            return true;
        else   
            return false;
        
    }
}