class Solution {
    public String getHint(String secret, String guess) {

        int bulls = 0, cows = 0;
        char s = ' ', g = ' ';
        ArrayList<Character> arrg = new ArrayList<>();
        ArrayList<Character> arrs = new ArrayList<>();

        for(int i =0; i<guess.length(); i++)
        {
            s = secret.charAt(i);
            g = guess.charAt(i);
            if(s==g)
            {
                bulls += 1;
            }
            else
            {
                arrs.add(s);
                arrg.add(g);
            }
        }
        for(int i =0; i<arrs.size(); i++)
        {
            if(arrg.contains(arrs.get(i)))
            {
                arrg.remove(arrs.get(i));
                cows++;
            }
        }


        return bulls+"A"+cows+"B";
        
    }
}