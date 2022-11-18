class Solution {
    public void sortColors(int[] nums) {

        int z = 0, o = 0, n = nums.length;

        for (int i : nums) {
            if (i == 0)
                z++;
            else if (i == 1)
                o++;
        }

        for (int i = 0; i < n; i++) {
            if (z > 0) {
                nums[i] = 0;
                z--;
            } else if (o > 0) {
                nums[i] = 1;
                o--;
            } else {
                nums[i] = 2;
            }
        }
    }
}