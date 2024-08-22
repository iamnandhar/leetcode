package src.Basics;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String str = "";
            if (i % 3 == 0) {
                str += "Fizz";
            }
            if (i % 5 == 0) {
                str += "Buzz";
            }
            if (str.isEmpty()) {
                str += i;
            }
            result.add(str);
        }
        return result;
    }
}
