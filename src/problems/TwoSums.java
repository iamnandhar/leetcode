package src.problems;

import java.util.HashMap;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        TwoSums twoSums = new TwoSums();
        int[] result = twoSums.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}