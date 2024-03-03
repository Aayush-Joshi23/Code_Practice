class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> list = new ArrayList<>();
        int j =1;

        for(int i=0; i<target.length; i++)
        {
            if( target[i] > j )
            {
                for(int k =j; k<target[i]; k++ )
                {
                    list.add("Push");
                    list.add("Pop");
                }
                j = target[i];
            }
            if(target[i] == j)  
                list.add("Push");
            j = target[i]+1;
        }
        return list;
        
    }
}