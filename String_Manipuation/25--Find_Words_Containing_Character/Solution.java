class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> list = new ArrayList<>();
        int i = 0;
        
        for(String st: words)
        {
            if(st.indexOf(x) != -1)
                list.add(i);
            i++;
        }

        return list;
        
    }
}