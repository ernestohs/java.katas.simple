package Katas.Simple;

public class Fibonacci {
    public static Integer Get(Integer  n) {
        
        Integer result = n; 
        
        if (n > 1) { // if N is 0 or 1, then we do not need to compute the value
            result = Get(n - 1) + Get(n - 2);
        } 
        
        return result;
    }
}
