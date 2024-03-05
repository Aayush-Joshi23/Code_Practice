class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);
        int score =0, l = 0, r = tokens.length-1, max = 0;
        
        while(l<=r)
        {
            if(tokens[l] <= power)
            {
                power -= tokens[l];
                l++;
                score++;
                max = Math.max(max, score);
            }
            else if(score>=1)
            {
                power += tokens[r];
                r--;
                score--;
            }
            else
                break;
        }
        return max;
        
    }
}