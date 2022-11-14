import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        int c = 1, j = nums[0], n = nums.length, l = nums[n - 1], m = 1;

        for (int i = 1; i < (n / 2 + 1); i++) {
            if (nums[i] != j && c < 2) {
                return j;
            } else if (nums[i] != j && c == 2) {
                j = nums[i];
                c = 1;
            } else {
                c += 1;
            }

            if (nums[n - i - 1] != l && m < 2) {
                return l;
            } else if (nums[n - i - 1] != l && m == 2) {
                l = nums[n - i - 1];
                m = 1;
            } else {
                m += 1;
            }

        }
        return j;
    }
}