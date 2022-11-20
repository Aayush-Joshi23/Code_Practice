import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n / 2 + 1; i++) {
            if (nums[i] != i)
                return i;

            if (nums[n - i - 1] != (n - i))
                return n - i;
        }
        return n;

    }
}