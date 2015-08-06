package Katas.Simple;

import org.junit.Test;
import java.util.HashMap;
import static junit.framework.Assert.assertEquals;

public class LeapYearTests
{
    @Test
    public void LeapYearTest() throws Exception {
        LeapYear target = new LeapYear();

        HashMap<Integer, Boolean> expected = new HashMap<Integer, Boolean>();
        expected.put(1600, true);
        expected.put(1660, true);
        expected.put(1724, true);
        expected.put(1788, true);
        expected.put(1912, true);
        expected.put(1972, true);
        expected.put(1601, false);
        expected.put(1973, false);

        for ( Integer item : expected.keySet()){
            Boolean actual = target.IsLeapYear( item );
            assertEquals(actual, expected.get(item));
        }
    }
}
