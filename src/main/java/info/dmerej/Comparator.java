package info.dmerej;

public class Comparator {
    String result;

    public void compare(int a, int b) {
        if (a < b) {
            result = "less than";
        }
        if (a > b) {
            result = "greater than";
        }
    }
}
