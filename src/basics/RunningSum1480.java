package src.basics;

import java.util.Arrays;

public class RunningSum1480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        calculateRunningSum(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] calculateRunningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}