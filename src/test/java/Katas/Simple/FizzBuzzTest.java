package Katas.Simple;

import java.util.*;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizz() throws Exception {

        FizzBuzz target = new FizzBuzz();

        String actual = target.Compute(3);
        String expected = "Fizz";

        assertEquals(actual, expected);
    }

    @Test
    public void testBuzz() throws Exception {

        FizzBuzz target = new FizzBuzz();

        String actual = target.Compute(5);
        String expected = "Buzz";

        assertEquals(actual, expected);
    }

    @Test
    public void testFizzBuzz() throws Exception {

        FizzBuzz target = new FizzBuzz();

        String actual = target.Compute(15);
        String expected = "FizzBuzz";

        assertEquals(actual, expected);
    }

    @Test
    public void test1To20() throws Exception {

        FizzBuzz target = new FizzBuzz();

        List<String> expected =  new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("7");
        expected.add("8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("11");
        expected.add("Fizz");
        expected.add("13");
        expected.add("14");
        expected.add("FizzBuzz");
        expected.add("16");
        expected.add("17");
        expected.add("Fizz");
        expected.add("19");
        expected.add("Buzz");

        int i = 0;
        for ( String item : expected){
            String actual = target.Compute(++i);
            assertEquals(actual, item);
        }
    }

    @Test
    public void testOnlyFizz1To100() throws Exception {

        FizzBuzz target = new FizzBuzz();

        int[] expected =  { 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99 };

        for ( int item : expected){
            String actual = target.Compute(item);
            assertEquals(actual, "Fizz");
        }
    }

    @Test
    public void testOnlyBuzz1To100() throws Exception {

        FizzBuzz target = new FizzBuzz();

        int[] expected =  { 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 100 };

        for ( int item : expected){
            String actual = target.Compute(item);
            assertEquals(actual, "Buzz");
        }
    }

    @Test
    public void testOnlyFizzBuzz1To100() throws Exception {

        FizzBuzz target = new FizzBuzz();

        int[] expected =  { 15, 30, 45, 60, 75, 90 };

        for ( int item : expected){
            String actual = target.Compute(item);
            assertEquals(actual, "FizzBuzz");
        }
    }

    @Test
    public void testZero() throws Exception {

        FizzBuzz target = new FizzBuzz();

        String actual = target.Compute(0);
        String expected = "FizzBuzz";

        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeValues1To20() throws Exception {

        FizzBuzz target = new FizzBuzz();

        List<String> expected =  new ArrayList<String>();
        expected.add("-1");
        expected.add("-2");
        expected.add("Fizz");
        expected.add("-4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("-7");
        expected.add("-8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("-11");
        expected.add("Fizz");
        expected.add("-13");
        expected.add("-14");
        expected.add("FizzBuzz");
        expected.add("-16");
        expected.add("-17");
        expected.add("Fizz");
        expected.add("-19");
        expected.add("Buzz");

        int i = 0;
        for ( String item : expected){
            String actual = target.Compute( - (++i) );
            assertEquals(actual, item);
        }
    }
}
