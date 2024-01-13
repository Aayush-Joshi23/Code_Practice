class Solution {
    public int minSteps(String s, String t) {

        int arr[] = new int[26];
        Arrays.fill(arr,0);

        for(int i = 0; i<s.length();i++)
        {
            arr[s.charAt(i) - 'a'] += 1;
            arr[t.charAt(i) -'a'] -=1;
        }
        int count = 0;
        
        for(int i = 0; i<26;i++)
        {
            if(arr[i]!=0)
                count += Math.abs(arr[i]);
        }

        return count/2;


    }
}
