package Easy.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 15, 4};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];

        OUTER_LABEL:
        for (int i = 0; i < nums.length; i++) {
            int counter = i + 1;

            for (int j = counter; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    indexes[0] = i;
                    indexes[1] = j;
                    break OUTER_LABEL;
                }
            }
        }
        return indexes;
    }

    // Эталонное решение
    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}