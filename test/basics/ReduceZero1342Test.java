package test.basics;

import org.junit.jupiter.api.Test;
import src.basics.ReduceZero1342;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReduceZero1342Test {
    @Test
    void returnsZeroStepsForZero() {
        assertEquals(0, ReduceZero1342.numberOfSteps(0));
    }

    @Test
    void returnsOneStepForOne() {
        assertEquals(1, ReduceZero1342.numberOfSteps(1));
    }

    @Test
    void returnsCorrectStepsForEvenNumber() {
        assertEquals(6, ReduceZero1342.numberOfSteps(14));
    }

    @Test
    void returnsCorrectStepsForOddNumber() {
        assertEquals(5, ReduceZero1342.numberOfSteps(7));
    }

    @Test
    void returnsCorrectStepsForLargeNumber() {
        assertEquals(12, ReduceZero1342.numberOfSteps(123));
    }
}