package Katas.Simple;

public class PerfectNumber {
    public static boolean is(int input) {
        if (input == 0) return false;
        int sum = 0;
        for (int i = 1; i <= input / 2; i++) {
            if (input % i != 0) continue;
            sum += i;
        }
        return sum == input;
    }
}
