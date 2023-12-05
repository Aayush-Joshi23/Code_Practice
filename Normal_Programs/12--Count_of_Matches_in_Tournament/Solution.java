class Solution {
    public int numberOfMatches(int n) {

        int i =0;
        while (n!=1)
        {
            i += (n)/2;
            n = (n%2==0)? n/2: (n/2)+1;
            
        }

        return i;
        
    }
}