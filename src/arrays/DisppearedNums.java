package src.arrays;

import java.util.ArrayList;
import java.util.List;

public class DisppearedNums {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        for(int i: findDisappearedNumbers(nums)) {
            System.out.print(i + " ");
        }
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for(int i: nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) {
                res.add(i+1);
            }
        }

        return res;
    }
}
