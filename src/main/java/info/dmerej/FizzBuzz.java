package info.dmerej;

public class FizzBuzz {

    public static String get(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        return String.valueOf(number);
    }
}
