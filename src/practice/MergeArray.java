package src.practice;

public class MergeArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        mergeArray(nums1, m, nums2, n);
        for(int num : nums1) {
            System.out.print(num + " ");
        }
    }
    public static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n -1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
