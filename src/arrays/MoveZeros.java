package src.arrays;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        while (j < n) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
            j++;
        }
        while (i < n) {
            nums[i++] = 0;
        }
    }
}
