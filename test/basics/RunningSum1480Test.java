package test.basics;

import org.junit.jupiter.api.Test;
import src.basics.RunningSum1480;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningSum1480Test {

    @Test
    void calculatesRunningSumForMultipleElements() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        assertArrayEquals(expected, RunningSum1480.calculateRunningSum(nums));
    }

    @Test
    void calculatesRunningSumForSingleElement() {
        int[] nums = {5};
        int[] expected = {5};
        assertArrayEquals(expected, RunningSum1480.calculateRunningSum(nums));
    }

    @Test
    void calculatesRunningSumForEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, RunningSum1480.calculateRunningSum(nums));
    }

    @Test
    void calculatesRunningSumForArrayWithZeroes() {
        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, RunningSum1480.calculateRunningSum(nums));
    }

    @Test
    void calculatesRunningSumForArrayWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4};
        int[] expected = {-1, -3, -6, -10};
        assertArrayEquals(expected, RunningSum1480.calculateRunningSum(nums));
    }
}