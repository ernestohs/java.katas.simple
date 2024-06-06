package Katas.Simple;

public class Palindrome {
    public static boolean v1(String input) {
        if (input == null) return false;
        boolean result = true;
        String target = input.toLowerCase().replaceAll("[^\\w\\d]", "");
        if (target.length() < 2) return false;

        int left = 0;
        int right = target.length() - 1;

        do {
            if (target.charAt(left++) == target.charAt(right--)) continue;
            result = false;
            break;
        } while (left > right);


        return result;
    }

    public static boolean v2(String input) {

        // a b c b a     a b c c b a
        // 0 1 2 3 4     0 1 2 3 4 5
        //     ^             ^
        // [a, a]        [a, a]
        // [b, b]        [b, b]
        // [ c, (c)]     [c, c]
        // 12 14 17 16 18 29 28
        if (input == null) return false;
        boolean result = false;
        String target = input.toLowerCase().replaceAll("[^\\w\\d]", "");
        if (target.length() < 2) return false;

        for (int left = 0, right = target.length() - 1; left <= right / 2; left++, right--) {
            if (target.charAt(left) != target.charAt(right)) {
                result = false;
                break;
            }
            result = true;
        }

        return result;
    }

    public static boolean v3(String input) {
        if (input == null) {
            return false;
        }

        String target = normalize(input);

        if (target.length() < 2) {
            return false;
        }

        for (int left = 0, right = target.length() - 1; left <= right;) {
            if (target.charAt(left++) != target.charAt(right--)) {
                return false;
            }
        }

        return true;
    }

    private static String normalize(String input) {
        return input.toLowerCase().replaceAll("[^\\w\\d]", "");
    }


    public static boolean is(String input) {
        return v2(input);
    }
}
