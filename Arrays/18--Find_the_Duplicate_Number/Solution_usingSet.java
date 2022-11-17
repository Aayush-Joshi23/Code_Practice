import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < (n / 2) + 1; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }

            if (set.contains(nums[n - i - 1])) {
                return nums[n - i - 1];
            } else {
                set.add(nums[n - i - 1]);
            }
        }
        return nums[n - 1];

    }
}