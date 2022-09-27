import java.io.*;
import java.util.*;

class Solution {
    public void findNextGreaterElementNums2(int[] nums, Map<Integer, Integer> map) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        st.push(nums[n - 1]);
        map.put(nums[n - 1], -1);
        for (int i = n - 2; i >= 0; i--) {
            while ((st.isEmpty() == false) && (nums[i] >= st.peek())) {
                st.pop();
            }
            if (st.isEmpty() == true) {
                map.put(nums[i], -1);
            } else {
                map.put(nums[i], st.peek());
            }
            st.push(nums[i]);
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        findNextGreaterElementNums2(nums2, map);

        int n = nums1.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}