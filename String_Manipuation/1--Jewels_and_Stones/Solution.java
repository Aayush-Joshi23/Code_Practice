class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        // int n = jewels.length(), m = stones.length();

        // HashSet<Character> hset = new HashSet<>();
        int c = 0;

        // for (int i = 0; i<n; i++)
        // {
        // hset.add(jewels.charAt(i));
        // }

        // for(int i = 0; i<m ; i++)
        // {
        // if(hset.contains(stones.charAt(i)))
        // {
        // c++;
        // }
        // }

        for (char ch : stones.toCharArray()) {
            if (jewels.indexOf(ch) != -1) {
                c++;
            }
        }
        return c;

    }
}