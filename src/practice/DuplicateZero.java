package src.practice;

public class DuplicateZero {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void duplicateZeros(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i == 0) {
                count++;
            }
        }
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (i + count < n) {
                arr[i + count] = arr[i];
            }
            if (arr[i] == 0) {
                count--;
                if (i + count < n) {
                    arr[i + count] = 0;
                }
            }
            System.out.println("i: " + i);
            System.out.println("count: " + count);
            for (int j : arr) {
                System.out.println(j + " ");
            }
        }
    }
}
