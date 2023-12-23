class Solution {
    public boolean isPathCrossing(String path) {

        int x = 0, y = 0;
        ArrayList<String> arr = new ArrayList<>();
        arr.add("0 0");

        for(int i=0; i<path.length();i++)
        {
            char ch = path.charAt(i);
            if(ch=='N')
                y += 1;
            
            else if(ch=='S')
                y -= 1;
            
            else  if(ch=='E')
                x += 1;
            
            else 
                x -= 1;
            
            if(arr.contains(y+" "+x))
            {
                return true;
            }
            arr.add(y+" "+x);
        }


        return false;
        
    }
}