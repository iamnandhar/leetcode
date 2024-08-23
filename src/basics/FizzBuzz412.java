package src.basics;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder str = new StringBuilder();
            if (i % 3 == 0) {
                str.append("Fizz");
            }
            if (i % 5 == 0) {
                str.append("Buzz");
            }
            if (str.isEmpty()) {
                str.append(i);
            }
            result.add(str.toString());
        }
        return result;
    }
}
