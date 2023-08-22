class Solution {
    public String convertToTitle(int columnNumber) {

        String out = "";

        while(columnNumber >0)
        {
            columnNumber--; 
            out = (char)(columnNumber%26 +'A') + out;
            columnNumber /= 26;
        }
        
        return out;
    }
        
}

