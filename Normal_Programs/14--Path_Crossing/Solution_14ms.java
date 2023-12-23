class Solution {
    public boolean isPathCrossing(String path) {

        int[] loc = {0,0};
        String l ="";
        ArrayList<String> arr = new ArrayList<>();
        arr.add("0 0");

        for(int i=0; i<path.length();i++)
        {
            char ch = path.charAt(i);
            if(ch=='N')
            {
                loc[1] += 1;
            }

            else if(ch=='S')
            {
                loc[1] -= 1;
            }
            else  if(ch=='E')
            {
                loc[0] += 1;
            }
            else if(ch=='W')
            {
                loc[0] -= 1;
            }

            l = loc[1]+" "+loc[0];
            System.out.println(l +" "+ch);
            if(arr.contains(l))
            {
                System.out.println(l+" $ "+ch);
                return true;
            }
            arr.add(l);
        }

        
        return false;
        
    }
}