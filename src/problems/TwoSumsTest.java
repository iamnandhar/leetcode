package src.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest {

    @Test
    void returnsIndicesForValidPair() {
        TwoSums twoSums = new TwoSums();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSums.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void returnsEmptyArrayWhenNoPairExists() {
        TwoSums twoSums = new TwoSums();
        int[] nums = {1, 2, 3, 4};
        int target = 8;
        int[] result = twoSums.twoSum(nums, target);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void handlesNegativeNumbers() {
        TwoSums twoSums = new TwoSums();
        int[] nums = {-1, -2, -3, -4};
        int target = -6;
        int[] result = twoSums.twoSum(nums, target);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    void handlesZeroAsTarget() {
        TwoSums twoSums = new TwoSums();
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] result = twoSums.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    void handlesSingleElementArray() {
        TwoSums twoSums = new TwoSums();
        int[] nums = {1};
        int target = 1;
        int[] result = twoSums.twoSum(nums, target);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void handlesEmptyArray() {
        TwoSums twoSums = new TwoSums();
        int[] nums = {};
        int target = 1;
        int[] result = twoSums.twoSum(nums, target);
        assertArrayEquals(new int[]{}, result);
    }
}