package src.arrays;

public class ArrayParity {
    public static void main(String[] args) {
        ArrayParity arrayParity = new ArrayParity();
        int[] A = {3, 1, 2, 4};
        int[] result = arrayParity.sortArrayByParity(A);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int evenIndex = 0;
        int oddIndex = A.length - 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[evenIndex++] = A[i];
            } else {
                result[oddIndex--] = A[i];
            }
        }

        return result;
    }
}
