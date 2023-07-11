package Katas.Simple;

public class Palindrome {
    public static boolean is(String input) {
        boolean result = true;
        int first = 0;
        int last = input.length() - 1;
        if (input.charAt(first) != input.charAt(last)) {
            result = false;
        }

        return result;
    }
}
