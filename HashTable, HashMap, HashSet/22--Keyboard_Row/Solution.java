class Solution {
    public String[] findWords(String[] words) {

        
        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();
        ArrayList<Character> l3 = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        l1.add('q');
        l1.add('w');
        l1.add('e');l1.add('r');l1.add('t');l1.add('y');l1.add('u');l1.add('i');l1.add('o');l1.add('p');
        l2.add('a');l2.add('s');l2.add('d');l2.add('f');l2.add('g');l2.add('h');l2.add('j');l2.add('k');l2.add('l');
        l3.add('z');l3.add('x');l3.add('c');l3.add('v');l3.add('b');l3.add('n');l3.add('m');
        boolean b = false;
        String st = "";
        char ch = ' ';
        
        for(String s: words)
        {
            b = false;
            st = s.toLowerCase();
            ch = st.charAt(0);
            int l = l1.contains(ch)? 1 : l2.contains(ch)? 2 : l3.contains(ch) ? 3 : 0;
            for(int i=0; i<s.length(); i++)
            {
                ch = st.charAt(i);
                if(l==1 && !l1.contains(ch) && (l2.contains(ch) || l3.contains(ch)) )
                {
                    b = false;
                    break;
                }
                else if(l==2 && !l2.contains(ch) && (l1.contains(ch) || l3.contains(ch)))
                {
                    b = false;
                    break;
                }
                else if(l==3 && !l3.contains(ch) && (l2.contains(ch) || l1.contains(ch)))
                {
                    b = false;
                    break;
                }
                b = true;
            }  

            if(b)
                res.add(s);

        }
        
        String r[] = new String[res.size()];
        int i =0;

        for(String s: res)
            r[i++] = s;
        return r;

    }
}