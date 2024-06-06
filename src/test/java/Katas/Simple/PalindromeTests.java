package Katas.Simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PalindromeTests {

    private boolean testExpected;
    private String testInput;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"abc", false}, // 0
                {"ada", true},  // 1
                {"aDa", true},
                {"aDA", true},
                {"ADA", true},
                {"Stanley Yelnats", true},
                {"Do geese see God?", true},
                {"Was it Eliot's toilet I saw?", true},
                {"Murder for a jar of red rum.", true},
                {"Some men interpret nine memos.", true},
                {"Never odd or even", true},
                {"\"Madam, I'm Adam\"", true},
                {"\"Madam in Eden, I'm Adam\"", true},
                {"Don't nod", true},
                {"Dogma: I am God", true},
                {"Never odd or even", true},
                {"Too bad – I hid a boot", true},
                {"Rats live on no evil star", true},
                {"No trace; not one carton", true},
                {"Was it Eliot's toilet I saw?", true},
                {"Murder for a jar of red rum", true},
                {"May a moody baby doom a yam?", true},
                {"Go hang a salami; I'm a lasagna hog!", true},
                {"Satan, oscillate my metallic sonatas!", true},
                {"A Toyota! Race fast... safe car: a Toyota", true},
                {"Straw? No, too stupid a fad; I put soot on warts", true},
                {"Are we not drawn onward, we few, drawn onward to new era?", true},
                {"Doc Note: I dissent. A fast never prevents a fatness. I diet on cod", true},
                {"No, it never propagates if I set a gap or prevention", true},
                {"Anne, I vote more cars race Rome to Vienna", true},
                {"Sums are not set as a test on Erasmus", true},
                {"Kay, a red nude, peeped under a yak", true},
                {"Some men interpret nine memos", true},
                {"Campus Motto: Bottoms up, Mac", true},
                {"Go deliver a dare, vile dog!", true},
                {"Madam, in Eden I'm Adam", true},
                {"Oozy rat in a sanitary zoo", true},
                {"Ah, Satan sees Natasha", true},
                {"Lisa Bonet ate no basil", true},
                {"Do geese see God?", true},
                {"God saw I was dog", true},
                {"Dennis sinned", true},
                {"Are we not pure? “No sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man; a prisoner up to new era.", true},
                {"Not a palindrome", false},
                {"A", false},
                {"1", false},
                {"", false},
                {"............", false},
                {null, false}
        });
    }

    public PalindromeTests(String input, boolean expected) {
        testInput = input;
        testExpected = expected;
    }

    @Test
    public void test() {
        assertEquals(Palindrome.is(testInput), testExpected);
    }
}
