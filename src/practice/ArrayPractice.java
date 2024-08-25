package src.practice;

public class ArrayPractice {
    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[1] = "Hello";
        arr[2] = "World";
        callMethod(arr);
    }
    private static void callMethod(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
