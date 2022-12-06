class Solution {
    public int maximumWealth(int[][] accounts) {

        int sum = 0, max = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;

    }
}