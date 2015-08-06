package Katas.Simple;

public class FizzBuzz {
    /**
     * FizzBuzz
     * @param number to compute
     * @return if value is divisible by 3 Fizz, by 5 Buzz and by both FizzBuzz if not then only display the number
     */
    public String Compute(int number) {
        String output = Integer.toString(number);

        String value = "";

        if (number % 3 == 0) value += "Fizz";
        if (number % 5 == 0) value += "Buzz";

        if (!value.isEmpty()) {
            output = value;
        }

        return output;
    }
}
