package Katas.Simple;

public class Fibonacci {
    public Integer Get(Integer number){
        if(number == 1 || number == 2){
            return 1;
        }
        
        Integer fibo1=1, fibo2=1, fibonacci=1;
        
        for(Integer i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        
        return fibonacci; //Fibonacci number
    }
}
