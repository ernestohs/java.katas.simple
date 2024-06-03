package Katas.Simple;
public class RomanNumbers {
    private static final int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int number) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < numbers.length && number != 0; i++) {
            while (number >= numbers[i]) {
                number -= numbers[i];
                output.append(roman[i]);
            }
        }

        return output.toString();
    }
}
