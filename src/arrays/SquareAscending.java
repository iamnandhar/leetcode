package src.arrays;

public class SquareAscending {
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        int[] result = sortedSquares(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
