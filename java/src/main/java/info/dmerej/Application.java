package info.dmerej;

public class Application {
    public static void main(String[] args) {
        var comparator = new Comparator();
        comparator.compare(1, 1);
        System.out.format("Result is %s", comparator.result.toUpperCase());
    }
}
