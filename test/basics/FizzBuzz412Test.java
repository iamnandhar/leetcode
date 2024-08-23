package test.basics;

import org.junit.jupiter.api.Test;
import src.basics.FizzBuzz412;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzz412Test {
    @Test
    void generatesFizzBuzzForRange() {
        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, FizzBuzz412.fizzBuzz(15));
    }

    @Test
    void generatesFizzBuzzForSingleNumber() {
        List<String> expected = List.of("1");
        assertEquals(expected, FizzBuzz412.fizzBuzz(1));
    }

    @Test
    void generatesFizzBuzzForNumberDivisibleByThree() {
        List<String> expected = Arrays.asList("1", "2", "Fizz");
        assertEquals(expected, FizzBuzz412.fizzBuzz(3));
    }

    @Test
    void generatesFizzBuzzForNumberDivisibleByFive() {
        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected, FizzBuzz412.fizzBuzz(5));
    }

    @Test
    void generatesFizzBuzzForNumberDivisibleByThreeAndFive() {
        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14");
        assertEquals(expected, FizzBuzz412.fizzBuzz(14));
    }

    @Test
    void generatesFizzBuzzForZero() {
        List<String> expected = List.of();
        assertEquals(expected, FizzBuzz412.fizzBuzz(0));
    }
}