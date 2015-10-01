package Katas.Simple;

public class Fibonacci {
    public static Integer Get(Integer  n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Get(n - 1) + Get(n - 2);
        }
    }
}
