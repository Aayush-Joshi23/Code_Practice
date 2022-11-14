import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        int c = 1, j = nums[0], n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] != j && c < 2) {
                return j;
            } else if (nums[i] != j && c == 2) {
                j = nums[i];
                c = 1;
            } else {
                c += 1;
            }
        }

        return j;
    }
}