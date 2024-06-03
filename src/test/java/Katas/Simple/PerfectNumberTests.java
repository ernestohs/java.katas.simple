package Katas.Simple;

import jdk.jshell.spi.ExecutionControl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

/**
 * In number theory, a perfect number is a positive integer that is equal
 * to the sum of its proper positive divisors, that is, the sum of its
 * positive divisors excluding the number itself.
 * Equivalently, a perfect number is a number that is half the sum of all
 * of its positive divisors (including itself) i.e. σ1(n) = 2n.
 */
@RunWith(Parameterized.class)
public class PerfectNumberTests {
    private boolean testExpected;
    private int testInput;

    public PerfectNumberTests(int input, boolean expected) {

        testInput = input;
        testExpected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0, false},
                {1, false},
                {2, false},
                {3, false},
                {4, false},
                {5, false},
                {7, false},
                {8, false},
                {9, false},
                {10, false},
                {11, false},
                {6, true},
                {28, true},
                {496, true},
                {8128, true},
                {33550336, true}
        });
    }

    @Test
    public void test() throws ExecutionControl.NotImplementedException {
        assertEquals(PerfectNumber.is(testInput), testExpected);
    }
}
