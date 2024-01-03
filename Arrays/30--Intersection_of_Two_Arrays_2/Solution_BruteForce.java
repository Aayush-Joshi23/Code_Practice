class Solution {
    public int[] intersect(int[] num1, int[] num2) {

        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int n: num1)
        {
            arr1.add(n);
        }
        for(int n: num2)
        {
            if(arr1.contains(n) )
            {
                arr1.remove(Integer.valueOf(n));
                res.add(n);
            }
        }
        int result[] = new int[res.size()];
        for(int i=0;i<res.size(); i++)
        {
            result[i] =res.get(i);
        }
        return result;
    }
    
}