package Katas.Simple;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

public class FibonacciTests
{
    @Test
    public void FibonacciTest() throws Exception {

        Fibonacci target = new Fibonacci();

        HashMap<Integer, Integer> expected = new HashMap<Integer, Integer>();
        expected.put(0,0);
        expected.put(1,1);
        expected.put(2,1);
        expected.put(3,2);
        expected.put(4,3);
        expected.put(5,5);
        expected.put(6,8);
        expected.put(7,13);
        expected.put(8,21);
        expected.put(9,34);
        expected.put(10,55);
        expected.put(11,89);
        expected.put(12,144);
        expected.put(13,233);
        expected.put(14,377);
        expected.put(15,610);
        expected.put(16,987);
        expected.put(17,1597);
        expected.put(18,2584);
        expected.put(19,4181);
        int i = 0;
        for ( Integer item : expected.values()){
            Integer actual = target.Get( item );
            assertEquals(actual, expected.get(item));
        }
    }
}
