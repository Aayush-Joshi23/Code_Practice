class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        HashSet<String> arr = new HashSet<>();
        int c = 0;
        String rev = "";

        for(String st: words)
        {          
            rev = ""+st.charAt(1)+st.charAt(0);
            if(st.equals(rev))
                continue;
            else if(arr.contains(rev))
                c++;
            else   
                arr.add(st);
        }
        
        return c;
        
    }
}