package Katas.Simple;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTests {

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][]{
                {0,0},
                {1,1},
                {2,1},
                {3,2},
                {4,3},
                {5,5},
                {6,8},
                {7,13},
                {8,21},
                {9,34},
                {10,55},
                {11,89},
                {12,144},
                {13,233},
                {14,377},
                {15,610},
                {16,987},
                {17,1597},
                {18,2584},
                {19,4181}
        });
    }

    private Integer test_input;

    private Integer test_expected;

    public FibonacciTests(int input, int expected) {
        test_input = input;
        test_expected = expected;
    }

    @Test
    public void test() {
        assertEquals(test_expected, Fibonacci.Get(test_input));
    }
}
