class Solution {
    public String destCity(List<List<String>> paths) {

        ArrayList<String> list = new ArrayList<>();
        String st = "";

        for(int i=0; i<paths.size(); i++)
            list.add(paths.get(i).get(0));
        

        for(int i =0; i<paths.size(); i++)
        {
            if(!list.contains(paths.get(i).get(1)) )
            {
                st = paths.get(i).get(1);
                break;
            }
        }

        return st;
        
    }
}