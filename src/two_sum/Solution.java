package two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = m.get(target - nums[i]);
            if (index != null) {
                return new int[]{ index, i};
            }
            m.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] result = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("result = " + Arrays.toString(result));
        assert result[0] == 0;
        assert result[1] == 1;
    }
}
