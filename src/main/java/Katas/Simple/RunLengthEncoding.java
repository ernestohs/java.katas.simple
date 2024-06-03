package Katas.Simple;

public class RunLengthEncoding {
    public static String encode(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        int counter = 0;
        char current_char = input.charAt(0);

        for (char character : input.toCharArray()) {
            if (current_char == character) {
                counter++;
                continue;
            }
            result.append(String.format("%s%s", counter, current_char));

            counter = 1;
            current_char = character;
        }

        result.append(String.format("%s%s", counter, current_char));

        return result.toString();
    }

    public static String decode(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        StringBuilder number = new StringBuilder();

        for (char current : input.toCharArray()) {

            if (Character.isDigit(current)) {
                number.append(current);
            } else {
                int count = Integer.parseInt(number.toString());
                number = new StringBuilder();
                result.append(String.format("%s", current).repeat(count));
            }
        }

        return result.toString();
    }
}
