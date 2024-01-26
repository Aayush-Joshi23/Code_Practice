class Solution {
    public int maxArea(int[] height) {
        
        int i = 0, cur = 0, e = height.length-1, max = 0;

        while(i<e)
        {
            cur = (height[i] < height[e] ? height[i] : height[e]) * (e-i); 
            max = max>cur ? max : cur ;

            if( height[i] < height[e] )
            {
                i++;
            }
            else
            {
                e--;
            }
        } 
        return max;

    }
}