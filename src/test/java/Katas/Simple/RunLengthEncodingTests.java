package Katas.Simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RunLengthEncodingTests {
    private String testExpected;
    private String testInput;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"aaaaaabcddccc", "6a1b1c2d3c"},
                {"AAAAAAAAAAAAAAA", "15A"},
                {"AAAAAAbbbXXXXXt", "6A3b5X1t"},
                {"Xtmprsqzntwlfb", "1X1t1m1p1r1s1q1z1n1t1w1l1f1b"},
                {"WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW", "12W1B12W3B24W1B14W"},
                {"aaaaaabcddccc", "6a1b1c2d3c"},
                {"AAAAAAAAAAAAAAA", "15A"},
                {"AAAAAAbbbXXXXXt", "6A3b5X1t"},
                {"Xtmprsqzntwlfb", "1X1t1m1p1r1s1q1z1n1t1w1l1f1b"},
                {"WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW", "12W1B12W3B24W1B14W"},
        });
    }

    public RunLengthEncodingTests (String input, String expected) {
        testInput = input;
        testExpected = expected;
    }

    @Test
    public void Test() throws  Exception{
        assertEquals(testExpected, RunLengthEncoding.encode(testInput));
        assertEquals(testInput, RunLengthEncoding.decode(testExpected));
    }

}
